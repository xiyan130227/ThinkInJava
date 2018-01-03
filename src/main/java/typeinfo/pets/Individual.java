package typeinfo.pets;

public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;

    private String name;

    public Individual() {
    }

    public Individual(String name) {
        this.name = name;
    }

    public long id() {
        return id;
    }

    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : "  " + name);
    }

    @Override
    public int compareTo(Individual o) {
        return 0;
    }
}
