package interfaces.music4;

abstract class Rodent {
    public abstract void hop();

    public abstract void scurry();

    public abstract void reproduce();
}

class Mouse extends Rodent {

    public void hop() {
        System.out.println("Mouse hopping");
    }

    public void scurry() {
        System.out.println("Mouse scurrying");
    }

    public void reproduce() {
        System.out.println("Making mre Mice");
    }

    public String toString() {
        return "Mouse";
    }
}

class Gerbil extends Rodent {

    public void hop() {
        System.out.println("Gerbil hopping");
    }

    public void scurry() {
        System.out.println("Gerbil scurry");
    }

    public void reproduce() {
        System.out.println("Gerbil reproduce");
    }

    public String toString() {
        return "Gerbil";
    }
}

class Hamster extends Rodent {

    public void hop() {
        System.out.println("Hamster hopping");
    }

    public void scurry() {
        System.out.println("Hamster scurry");
    }

    public void reproduce() {
        System.out.println("Hamster reproduce");
    }

    public String toString() {
        return "Hamster";
    }
}

public class E01_AbstractRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster(),
        };

        for (Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
