package java8.gpdata;

@FunctionalInterface
public interface MyPredicate<T> {

    boolean test(T t);

}
