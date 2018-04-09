package containers;

import java.util.*;

public class Lists {
    private static List<String> countryList =  Arrays.asList(
            "China", "Japan", "Canada", "America", "France",
            "England", "Australia", "Mexico", "Mongolia", "Korea");
    public static void basicTest(List<String> a) {
//        a.add(1, "x");
//
//        a.add("x");
//        a.addAll(countryList);
        a.addAll(3,countryList);


        System.out.println(a);

//        a.addAll(countryList);

    }

    public static void main(String[] args) {
        basicTest(new LinkedList<String>(countryList));
    }

}
