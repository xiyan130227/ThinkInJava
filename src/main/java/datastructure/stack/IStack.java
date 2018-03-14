package datastructure.stack;

public interface IStack {
    void clear();

    boolean isEmpty();

    int length();

    Object peek();

    void push(Object x) throws Exception;

    Object pop();
}
