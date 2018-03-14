package generics;

import java.util.*;

public class FilledListmaker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++)
            result.add(t);
        return result;
    }

    public static void main(String[] args) {
        FilledListmaker<String> stringMaker = new FilledListmaker<>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }
}

