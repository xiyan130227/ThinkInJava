package reusing.protectedkey;

class Derived extends E15_Protected {
    public void g() {
        f();
    }
}

public class E15_ProtectedTest {
    public static void main(String[] args) {
        new Derived().g();
    }
}
