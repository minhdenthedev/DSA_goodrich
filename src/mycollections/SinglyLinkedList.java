package mycollections;

public class SinglyLinkedList<E> implements List<E>, Stack<E>, Queue<E> {
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
    private Node<E> head = null;
    private Node<E> tail = null;
    public SinglyLinkedList() {}

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
        if (isEmpty()) return null;
        return head.getElement();
    }

    @Override
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    @Override
    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            // if size == 0 then head.getNext() = null then head also null
            tail = null;
        }
        return answer;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        if (size == 1) {
            Node<E> answer = head;
            head = tail = null;
            size--;
            return answer.getElement();
        }
        tail = head;
        // Access the index right before tail.
        for (int i = 1; i < size - 1; i++) {
            tail = tail.getNext();
        }
        Node<E> answer = tail.getNext();
        tail.setNext(null);
        size--;

        return answer.getElement();
    }

    @Override
    public void push(E e) {
        addFirst(e);
    }

    @Override
    public E top() {
        return first();
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public void enqueue(E e) {
        addLast(e);
    }
 
    @Override
    public E dequeue() {
        return removeFirst();
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        if (i == size - 1) {
            return last();
        } else if (i == 0) {
            return first();
        } else {
            Node<E> current = head;
            for (int k = 1; k <= i; k++) {
                current = current.getNext();
            }
            return current.getElement();
        }
    }

    @Override
    public E set(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        if (i == size - 1) {
            E answer = tail.getElement();
            tail.setElement(e);
            return answer;
        } else if (i == 0) {
            E answer = head.getElement();
            head.setElement(e);
            return answer;
        } else {
            Node<E> current = head;
            for (int k = 1; k <= i; k++) {
                current = current.getNext();
            }
            E answer = current.getElement();
            current.setElement(e);
            return answer;
        }
    }

    @Override
    public void add(int i, E e) throws IndexOutOfBoundsException {
        if (i < 0 || i > size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        if (i == size) {
            addLast(e);
        } else if (i == 0) {
            addFirst(e);
        } else {
            Node<E> current = head;
            for (int k = 1; k < i; k++) {
                current = current.getNext();
            }
            Node<E> newNode = new Node<>(e, current.getNext());
            current.setNext(newNode);
            size++;
        }
    }

    @Override
    public E remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index " + i + " out of bounds.");
        if (i == size - 1) {
            return removeLast();
        } else if (i == 0) {
            return removeFirst();
        } else {
            Node<E> current = head;
            for (int k = 1; k < i; k++) {
                current = current.getNext();
            }
            Node<E> answer = current.getNext();
            current.setNext(answer.getNext());
            size--;
            return answer.getElement();
        }
    }
}
