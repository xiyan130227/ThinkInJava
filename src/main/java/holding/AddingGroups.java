package holding;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        c.addAll(Arrays.asList(moreInts));

        Collections.addAll(c, 11, 12, 13, 14, 15);

        Integer[] moreInts2 = {16, 17, 18, 19, 20};
        Collections.addAll(c, moreInts2);

        for (Integer i : c)
            System.out.print(i + ",  ");

        System.out.println();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list.set(1, 99);

        for (Integer i : list)
            System.out.print(i + ",  ");
    }
}
