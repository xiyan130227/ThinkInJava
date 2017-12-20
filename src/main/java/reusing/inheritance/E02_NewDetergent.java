package reusing.inheritance;

class NewDetergent extends Detergent {
    public void scrub() {
        append("    NewDetergent.scrub()");
        super.scrub();
    }

    public void sterilize() {
        append("    sterilize()");
    }
}

public class E02_NewDetergent {
    private NewDetergent nd;

    public static void main(String[] args) {
        NewDetergent nd = new NewDetergent();
        nd.dilute();
        nd.scrub();
        nd.sterilize();
        System.out.println(nd);
        Detergent d = new Detergent();
        d.scrub();
        System.out.println(d);
    }
}
