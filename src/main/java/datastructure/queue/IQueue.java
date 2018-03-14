package datastructure.queue;

public interface IQueue {
    void clear();

    boolean isEmpty();

    int length();

    Object peek();

    void offer(Object x) throws Exception;

    Object poll();
}
