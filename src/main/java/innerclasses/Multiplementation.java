package innerclasses;

class D {
}

abstract class E {
}

class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}

public class Multiplementation {
    static void takesD(D d) {
    }

    static void takesE(E d) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}
