package generics;

public class Genericmethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        Genericmethods gm = new Genericmethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1);
        gm.f('c');
        gm.f(gm);
    }
}
