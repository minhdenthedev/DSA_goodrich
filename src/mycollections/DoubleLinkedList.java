package mycollections;

public class DoubleLinkedList<E> implements List<E>, Deque<E> {
    public static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;
        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
    private int size = 0;
    private Node<E> header;
    private Node<E> trailer;
    public DoubleLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
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
        if (size == 0) return null;
        return header.next.element;
    }

    @Override
    public E last() {
        if (size == 0) return null;
        return trailer.prev.element;
    }

    private void addBetween(E e, Node<E> p, Node<E> n) {
        Node<E> newest = new Node<>(e, p, n);
        p.setNext(newest);
        n.setPrev(newest);
        size++;
    }

    private E remove(Node<E> e) {
        Node<E> p = e.getPrev();
        Node<E> n = e.getNext();
        p.setNext(n);
        n.setPrev(p);
        size--;
        return e.getElement();
    }

    @Override
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    @Override
    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);

    }

    @Override
    public E removeFirst() {
        if (size == 0) return null;
        return remove(header.getNext());
    }

    @Override
    public E removeLast() {
        if (size == 0) return null;
        return remove(trailer.getPrev());
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (isEmpty()) return null;
        Node<E> current = header.getNext();
        for (int k = 1; k <= i; k++) {
            current = current.getNext();
        }
        return current.getElement();
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (isEmpty()) return null;
        Node<E> current = header.getNext();
        for (int k = 1; k <= i; k++) {
            current = current.getNext();
        }
        Node<E> answer = current;
        current.setElement(e);
        return answer.getElement();
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (isEmpty()) {
            addBetween(e, header, trailer);
        }
        Node<E> current = header.getNext();
        for (int k = 1; k < i; k++) {
            current = current.getNext();
        }
        addBetween(e, current, current.getNext());
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i > size)
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds " + size);
        if (isEmpty()) return null;
        Node<E> current = header.getNext();
        for (int k = 1; k <= i; k++) {
            current = current.getNext();
        }
        E answer = current.getElement();
        remove(current);
        return answer;
    }
}
