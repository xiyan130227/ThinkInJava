package datastructure.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test3_1 {
    public static <AnyType> void printLots(List<AnyType> L, List<Integer> P) {
        Iterator<AnyType> iterL = L.iterator();
        Iterator<Integer> iterP = P.iterator();

        AnyType itemL = null;
        Integer itemP = 0;
        int start = 0;

        while (iterL.hasNext() && iterP.hasNext()) {
            itemP = iterP.next();

            System.out.println("Looking for position " + itemP);
            while (start < itemP && iterL.hasNext()) {
                start++;
                itemL = iterL.next();
            }
            System.out.println(itemL);
        }
    }

    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        List<Integer> P = new ArrayList<>();

        L.add(1);
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        L.add(6);
        L.add(7);

        P.add(1);
        P.add(3);
        P.add(4);
        P.add(6);

        printLots(L, P);
    }
}
