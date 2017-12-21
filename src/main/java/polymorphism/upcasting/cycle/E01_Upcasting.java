package polymorphism.upcasting.cycle;

import polymorphism.upcasting.cycle.Bicycle;
import polymorphism.upcasting.cycle.Cycle;
import polymorphism.upcasting.cycle.Tricycle;
import polymorphism.upcasting.cycle.Unicycle;

public class E01_Upcasting {
    public static void ride(Cycle c) {
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
