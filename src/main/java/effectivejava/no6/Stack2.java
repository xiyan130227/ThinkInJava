package effectivejava.no6;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack2 {
    private Object[] elements;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size = 0;

    public Stack2() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size ++] = e;
    }

    public Object pop() {
        if(size == 0)
            throw new EmptyStackException();

        Object result = elements[-- size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if(elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

}
