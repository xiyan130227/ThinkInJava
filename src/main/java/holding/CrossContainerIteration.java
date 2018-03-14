package holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + "     ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets = Pets.arrayList(8);
//        display(pets.iterator());
//
//        LinkedList<Pet> petsLL = new LinkedList<>(pets);
//        display(petsLL.iterator());
//
        HashSet<Pet> petsHS = new HashSet<>(pets);
//        display(petsHS.iterator());
//
        TreeSet<Pet> petsTS = new TreeSet<>(pets);
        display(petsTS.iterator());
    }
}
