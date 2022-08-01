package streams1;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        example2();
    }

    private static void example1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int factor = 2;
        int[] res = IntStream.of(arr).map(x -> x * factor).toArray();
        for (int x : res) {
            System.out.print(x+" ");
        }
//        factor = 0;
        System.out.println();
        System.out.println("factor = " + factor);
    }

    private static void example2() {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] factor = {2};
//        IntStream stream = IntStream.of(arr).map(x -> x * factor[0]);
//        stream.forEach(x->System.out.println(x+ " "));
//        factor[0] = 0;
//        System.out.println();
//        System.out.println("factor = " + factor[0]);

//        Stream<Object> s1 = Stream.empty();
//        Stream<Object> s2 = Stream.empty();
        List<Object> s1 = Collections.emptyList();
        List<Object> s2 = Collections.emptyList();
        System.out.println(s1 == s2);
    }
}
