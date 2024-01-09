package mycollections;

public class CircularlyLinkedList<E> implements List<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> n) {
            next = n;
        }
        public void setElement(E e) {
            element = e;
        }
    }
    private int size = 0;
    private Node<E> tail;
    public CircularlyLinkedList() {}

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    /**
     * Assign the tail to its next node.
     */
    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            for (int i = 0; i < size - 1; i++) {
                tail = tail.getNext();
            }
            tail.setNext(head);
        }
        size--;
        return head.getElement();
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (i == 0) {
            return first();
        }
        if (i == size - 1) {
            return last();
        }
        Node<E> current = tail.getNext();
        for (int k = 1; k <= i; k++) {
            current = current.next;
        }
        return current.element;
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (i == 0) {
            Node<E> answer = tail.getNext();
            tail.getNext().setElement(e);
            return answer.getElement();
        }
        if (i == size - 1) {
            Node<E> answer = tail;
            tail.setElement(e);
            return answer.getElement();
        }
        Node<E> current = tail.getNext();
        for (int k = 1; k <= i; k++) {
            current = current.next;
        }
        E answer = current.getElement();
        current.setElement(e);
        return answer;
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (i == 0) {
            addFirst(e);
        } else if (i == size) {
            addLast(e);
        } else {
            Node<E> current = tail.getNext();
            for (int k = 1; k < i; k++) {
                current = current.next;
            }
            Node<E> newNode = new Node<>(e, null);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (i == 0) {
            return removeFirst();
        } else if (i == size - 1) {
            return removeLast();
        } else {
            Node<E> current = tail.getNext();
            for (int k = 1; k < i; k++) {
                current = current.next;
            }
            Node<E> answer = current.getNext();
            current.setNext(answer.getNext());
            size--;
            return answer.getElement();
        }
    }
}
