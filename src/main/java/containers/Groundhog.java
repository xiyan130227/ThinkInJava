package containers;

public class Groundhog {
    protected int number;

    public Groundhog(int n) {
        number = n;
    }

    public String toStirng() {
        return "Groundhog #" + number;
    }
}
