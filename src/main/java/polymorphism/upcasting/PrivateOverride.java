package polymorphism.upcasting;

class Derived extends PrivateOverride {
    //    @Override
    public void f() {
        System.out.println("public f()");
    }
}

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}
