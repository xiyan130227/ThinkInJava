package interfaces;

import polymorphism.constructor.Sandwich;

interface FastFood {
    void rushOrder();

    void gobble();
}

class FastSandwith extends Sandwich implements FastFood {
    public void rushOrder() {
        System.out.println("Rushing your sandwich order");
    }

    public void gobble() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}

public class E08_FastFood {
    public static void main(String[] args) {
        FastSandwith burger = new FastSandwith();
        System.out.println("Fries with that?");
        System.out.println("Super Size?");
        burger.rushOrder();
        burger.gobble();
    }
}
