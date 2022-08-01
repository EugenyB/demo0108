package catdog;

interface Кот { default void мяукать() { System.out.println("мяу"); } }
interface Пёс { default void лаять() { System.out.println("гав"); } }
interface Корова { default void мычать() { System.out.println("му"); } }

public class Main {
    public static void main(String[] args) {
        class Котопёс implements Кот, Пёс {}
        test(new Котопёс());
    }

    private static void test(Object o) {
        var x = (Кот & Пёс & Корова) o;
        x.мяукать();
        x.лаять();
        x.мычать();
    }
}
