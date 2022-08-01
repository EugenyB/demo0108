package main;

public class Main {

    private double total;
    private int finished;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        // y = sin(x) [0, PI] 2
        double a = 0;
        double b = Math.PI;
        int n = 1_000_000_000;
//        IntegralCalculator calc = new IntegralCalculator(a, b, n, Math::sin);
//        long startTime = System.currentTimeMillis();
//        double result = calc.calculate();
//        long finishTime = System.currentTimeMillis();
//        System.out.println("result = " + result);
//        System.out.println(finishTime - startTime);
        int nThreads = 10;
        long startTime = System.currentTimeMillis();
        double delta = (b-a)/nThreads;
        total = 0;
        finished = 0;
        for (int i = 0; i < nThreads; i++) {
            new Thread(
                    new ThreadIntegralCalculator(a + i*delta, a+(i+1) * delta, n/nThreads, Math::sin, this)
            ).start();
        }

        try {
            synchronized (this) {
                while (finished < nThreads) {
                    wait();
                }
            }
        } catch (InterruptedException e) {
            System.err.println("interrupted");
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("total = " + total);
        System.out.println(finishTime - startTime);
    }

    public synchronized void sendResult(double v) {
            total += v;
            finished++;
            notify();
    }
}