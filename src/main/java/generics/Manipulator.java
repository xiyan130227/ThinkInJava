package generics;

public class Manipulator<T extends HasF> {
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<>(hf);
        manipulator.manipulate();


    }
}

class Manipulator2 {
    private HasF obj;

    public Manipulator2(HasF x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
}

class ReturnGenericType<T extends HasF> {
    private T obj;

    public ReturnGenericType(T x) {
        obj = x;
    }

    public T get() {
        return obj;
    }
}