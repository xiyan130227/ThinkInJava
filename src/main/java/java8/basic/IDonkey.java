package java8.basic;

public interface IDonkey {
    void eat();

    default void run() {
        System.out.println("Donkey run");
    }
}
