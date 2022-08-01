package main;

public class MyThread implements Runnable {

    private int factor;

    public MyThread(int factor) {
        this.factor = factor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i*factor);
        }
    }
}
