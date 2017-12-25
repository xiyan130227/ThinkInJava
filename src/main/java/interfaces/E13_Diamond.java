package interfaces;

interface BaseInterface {
    void f();
}

interface IntermediateInterface1 extends BaseInterface {
    void f();
}

interface IntermediateInterface2 extends BaseInterface {
    void f();
}

interface CombinedInterface extends IntermediateInterface1, IntermediateInterface2 {
    void f();
}

class CombinedImpl implements CombinedInterface {
    public void f() {

    }
}

public class E13_Diamond {
    public static void main(String[] args) {
        new CombinedImpl().f();
    }
}
