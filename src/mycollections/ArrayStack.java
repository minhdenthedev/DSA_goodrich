package mycollections;

public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000;
    private E[] data;
    private int top = -1;
    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }
    public ArrayStack() {
        this(CAPACITY);
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void push(E e) {
        if (size() == data.length) { enlarge(); }
        data[++top] = e;
    }

    @Override
    public E top() {
        return data[top];
    }

    @Override
    public E pop() {
        if (isEmpty()) return null;
        E temp = data[top];
        data[top] = null;
        top--;
        return temp;
    }

    private void enlarge() {
        E[] newData = (E[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
