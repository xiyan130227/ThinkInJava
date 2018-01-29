package java8.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Cycle {
    static int[] iArr = {1, 3, 4, 5, 6, 9, 8, 7, 4, 2};

    public static void demo3() {
        final int num = 2;
        Function<Integer, Integer> stringConverter = (from) -> from * num;
//        num ++;
        System.out.println(stringConverter.apply(3));
    }

    public static void imperative() {
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(iArr[i]);
        }
    }

    public static void declarative() {
        Arrays.stream(iArr)
                .map(x -> x = x + 1)
                .forEach(System.out::print);

        System.out.println();

        Arrays.stream(iArr)
                .forEach(System.out::print);
    }

    public static void isOdd() {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] % 2 != 0) {
                iArr[i]++;
            }
            System.out.print(iArr[i]);
        }
    }

    public static void isOddSimple() {
        Arrays.stream(iArr)
                .map(x -> x % 2 == 0 ? x : x + 1)
                .forEach(System.out::print);
    }

    public static void demo1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach((Integer value) -> System.out.println(value));
    }

    @FunctionalInterface
    public static interface IntHandler {
        void handle(int i);

        //        void handle2(int i);
        boolean equals(Object obj);
    }

    public static void main(String[] args) {
//        imperative();
//        declarative();

//        isOdd();
//        System.out.println();
//        isOddSimple();

        demo3();
    }

}
