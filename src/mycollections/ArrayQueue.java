package mycollections;

public class ArrayQueue<E> implements Queue<E> {
    private static final int CAPACITY = 100;
    private E[] data;
    private int front = 0;
    private int size = 0;
    public ArrayQueue() { this(CAPACITY); }
    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if (size == data.length) {
            enlarge();
        }
        int newest = (front + size) % data.length;
        data[newest] = e;
        size++;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[front];
    }

    @Override
    public E dequeue() {
        E answer = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;

        return answer;
    }

    private void enlarge() {
        E[] newData = (E[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
