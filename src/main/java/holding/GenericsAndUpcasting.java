package holding;

import java.util.*;

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Bracburn extends Apple {
}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Bracburn());

        for (Apple apple : apples) {
            System.out.println(apple.id());
        }
    }
}
