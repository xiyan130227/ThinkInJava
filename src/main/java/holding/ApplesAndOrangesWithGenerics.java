package holding;

import java.util.ArrayList;

public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
//        apples.add(new Orange());

        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }

        System.out.println("****************************");
        for (Apple apple : apples) {
            System.out.println(apple.id());
        }
    }
}
