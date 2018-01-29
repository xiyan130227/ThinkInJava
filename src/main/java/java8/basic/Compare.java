package java8.basic;

import java.util.Comparator;

public class Compare {
    public static void demo1() {
        Comparator<String> cmp = Comparator.comparingInt(String::length)
                .thenComparing(String.CASE_INSENSITIVE_ORDER);
    }
}
