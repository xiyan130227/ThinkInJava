package holding;

import typeinfo.Person;
import typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOfList {

    public static Map<Person, List<? extends Pet>> petPeople = new HashMap<>();

    static {
        petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
        petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
    }

    public static void main(String[] args) {
        System.out.println(petPeople.keySet());
        System.out.println(petPeople.values());
        for (Person person : petPeople.keySet()) {
            System.out.print(person + " has:  ");
            for (Pet pet : petPeople.get(person))
                System.out.println("    " + pet);
            System.out.println();
        }
    }
}
