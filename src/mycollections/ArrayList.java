package mycollections;

import java.util.Iterator;

public class ArrayList<E> implements List<E>, Iterable<E> {
    private E[] data;
    private int size = 0;
    private final static int CAPACITY = 16;
    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }
    public ArrayList() {
        this(CAPACITY);
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
    public E first() {
        return data[0];
    }

    @Override
    public E last() {
        return data[size - 1];
    }

    @Override
    public void addFirst(E e) {
        add(0, e);
    }

    @Override
    public void addLast(E e) {
        add(size, e);
    }

    @Override
    public E removeFirst() {
        return remove(0);
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        return data[i];
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        E answer = data[i];
        data[i] = e;
        return answer;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        if (size == data.length) {
            enlarge();
        }
        if (i == size) {
            data[size] = e;
        } else {
            for (int k = size; k > i; k--) {
                data[k] = data[k  - 1];
            }
            data[i] = e;
        }
        size++;
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        E answer = data[i];
        if (i == size - 1) {
            data[--size] = null;
        } else {
            for (int k = i; k < size; k++) {
                data[k] = data[k + 1];
            }
            size--;
        }
        return answer;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        E answer = data[size - 1];
        data[size--] = null;
        return answer;
    }

    private void enlarge() {
        E[] newData = (E[]) new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return data[i] != null;
            }

            @Override
            public E next() {
                E temp = data[i];
                i++;
                return temp;
            }
        };
    }
}
