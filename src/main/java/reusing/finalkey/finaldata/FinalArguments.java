package reusing.finalkey.finaldata;

class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {
    void with(final Gizmo g) {
//        g = new Gizmo();
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    //    void f(final int i) { i ++; }
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
