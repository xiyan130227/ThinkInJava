package holding;

import java.util.*;

public class ForeachCollections {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Take the long way home".split(" "));
        for (String s : cs)
            System.out.print("'" + s + "'  ");
    }
}
