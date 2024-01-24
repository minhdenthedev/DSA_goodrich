package chapter6.exercises.projects.p6_38;

/**
 * @author hminh
 * A simple leaky stack that removes the oldest element when the stack is full.
 * @param <E>   generic type
 */
public class LeakyStack<E> {
    private E[] data;
    private int top = -1;
    public LeakyStack() {
        data = (E[]) new Object[10];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void leak() {
        int tail = (top + 1) % data.length;
        data[tail] = null;
    }

    public void push(E e) {
        if (top == data.length - 1) {
            leak();
        }
        top = (top + 1) % data.length;
        data[top] = e;
    }

    public E top() {
        return data[top];
    }

    public E pop() {
        E answer = data[top];
        data[top] = null;
        top = (top - 1) % data.length;
        return answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E e: data) {
            sb.append(e);
            sb.append(" ");
        }

        return sb.toString();
    }
}
