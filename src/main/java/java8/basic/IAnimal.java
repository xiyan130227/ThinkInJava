package java8.basic;

public interface IAnimal {
    default void breath() {
        System.out.println("breath");
    }
}
