package holding;

import typeinfo.pets.*;

import java.util.*;

public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        System.out.println(pets);

        Hamster h = new Hamster();
        pets.add(h);
        System.out.println(pets);

        System.out.println(pets.contains(h));

        pets.remove(h);
        Pet p = pets.get(2);
        System.out.println(pets.indexOf(p));

        Pet cymric = new Cymric();
        System.out.println(pets.indexOf(cymric));

        System.out.println(pets.remove(cymric));
        System.out.println(pets.remove(p));
        System.out.println(pets);

        pets.add(3, new Mouse());
        System.out.println(pets);

        List<Pet> sub = pets.subList(1, 4);
        System.out.println(sub);
//        System.out.println(pets.containsAll(sub));

        Collections.sort(sub);
        System.out.println(sub);

        System.out.println(pets.containsAll(sub));

        Collections.shuffle(sub, rand);
        System.out.println(sub);

        System.out.println(pets.containsAll(sub));

        System.out.println(pets);
        List<Pet> copy = new ArrayList<>(pets);
        System.out.println(copy);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println(sub);

        copy.retainAll(sub);
        System.out.println(copy);

        copy = new ArrayList<>(pets);
        copy.remove(2);
        System.out.println(copy);

        copy.removeAll(sub);
        System.out.println(copy);

        copy.set(1, new Mouse());
        System.out.println(copy);

        copy.addAll(2, sub);
        System.out.println(copy);
        System.out.println(pets.isEmpty());

        pets.clear();
        System.out.println(pets);
        System.out.println(pets.isEmpty());

        pets.addAll(Pets.arrayList(4));
        System.out.println(pets);

        Object[] o = pets.toArray();
        System.out.println(o[3]);

        Pet[] pa = pets.toArray(new Pet[0]);
        System.out.println(pa[3].id());

    }
}
