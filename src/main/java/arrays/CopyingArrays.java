package arrays;

import java.util.*;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];

        Arrays.fill(i, 47);
        Arrays.fill(j, 99);

        System.arraycopy(i, 0, j, 0, i.length);

        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));

        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];

        Arrays.fill(u, new Integer(47));
        Arrays.fill(v, new Integer(99));

        System.arraycopy(i, 0, u, u.length / 2, i.length);

        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(v));
    }
}
