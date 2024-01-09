package mycollections;

public class SinglyLinkedList<E> implements List<E>, Stack<E> {
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
}
