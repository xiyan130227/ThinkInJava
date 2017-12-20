package reusing.delegation;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append("    dilute()");
    }

    public void apply() {
        append("    apply()");
    }

    public void scrub() {
        append("    scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class DetergentDelegation {
    private Cleanser cleanser = new Cleanser();

    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        append("    DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        append("    foam()");
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class: ");
        Cleanser.main(args);
    }
}

public class E11_Delegation {
    public static void main(String[] args) {
        DetergentDelegation.main(args);
    }
}
