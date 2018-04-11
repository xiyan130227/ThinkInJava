package java8.gpdata;

@FunctionalInterface
public interface MyFun<T> {

    T getValue(T t);
}
