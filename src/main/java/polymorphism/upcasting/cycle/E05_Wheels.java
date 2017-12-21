package polymorphism.upcasting.cycle;

public class E05_Wheels {
    public static void ride(Cycle c) {
        System.out.println("Num. pf wheels:  " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
