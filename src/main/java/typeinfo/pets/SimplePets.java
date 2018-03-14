package typeinfo.pets;

import generics.New;

import java.util.*;

public class SimplePets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = New.map();
    }
}
