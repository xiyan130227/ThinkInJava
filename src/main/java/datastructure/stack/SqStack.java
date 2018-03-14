package datastructure.stack;

public class SqStack implements IStack {

    private Object[] stackElem;
    private int top;

    public SqStack(int maxSize) {
        this.top = 0;
        stackElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public Object peek() {
        if (!isEmpty())
            return stackElem[top - 1];
        else
            return null;
    }

    @Override
    public void push(Object x) throws Exception {
        if (top == stackElem.length)
            throw new Exception("栈已满");
        else
            stackElem[top++] = x;
    }

    @Override
    public Object pop() {
        if (isEmpty())
            return null;
        else
            return stackElem[--top];
    }

    public void display() {
        for (int i = top - 1; i >= 0; i--)
            System.out.println(stackElem[i].toString() + "  ");
    }
}
