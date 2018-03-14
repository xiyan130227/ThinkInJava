package holding;

import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;
import typeinfo.pets.Pets;
import typeinfo.pets.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));

        System.out.println(pets);

        System.out.println(pets.getFirst());
        System.out.println(pets.element());
        System.out.println(pets.peek());
        System.out.println(pets.remove());
        System.out.println(pets.poll());
        System.out.println(pets);

        pets.addFirst(new Rat());
        System.out.println(pets);

        pets.offer(Pets.randomPet());
        System.out.println(pets);

        pets.add(Pets.randomPet());
        System.out.println(pets);

        pets.addLast(new Hamster());
        System.out.println(pets);

        System.out.println(pets.removeLast());
    }
}
