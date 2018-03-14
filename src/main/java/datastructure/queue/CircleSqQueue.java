package datastructure.queue;

public class CircleSqQueue implements IQueue {

    private Object[] queueElem;
    private int front;
    private int rear;

    public CircleSqQueue(int maxSize) {
        this.front = this.rear = 0;
        queueElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        front = rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public int length() {
        return (rear - front + queueElem.length) % queueElem.length;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public void offer(Object x) throws Exception {

    }

    @Override
    public Object poll() {
        return null;
    }
}
