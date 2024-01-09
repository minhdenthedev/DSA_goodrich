package mycollections;

public class PositionalLinkedList<E> implements PositionalList<E> {
    public static class Node<E> implements Position<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;
        public Node(E e, Node<E> prev, Node<E> next) {
            element = e;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public E getElement() throws IllegalStateException {
            if (next == null) throw new IllegalStateException("Position no longer valid.");
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
    public PositionalLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    private Node<E> validate(Position<E> p) throws IllegalStateException{
        if (!(p instanceof Node)) throw new IllegalStateException("Invalid p");
        Node<E> node = (Node<E>) p;
        if (node.getNext() == null) throw new IllegalStateException("p is no longer in the list.");
        return node;
    }

    private Position<E> position(Node<E> node) {
        if (node == header || node == trailer) return null;
        return node;
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
    public Position<E> first() {
        return position(header.getNext());
    }

    @Override
    public Position<E> last() {
        return position(trailer.getPrev());
    }

    @Override
    public Position<E> before(Position<E> p) throws IllegalStateException {
        Node<E> node = validate(p);
        return position(node.getPrev());
    }

    @Override
    public Position<E> after(Position<E> p) throws IllegalStateException {
        Node<E> node = validate(p);
        return position(node.getNext());
    }

    private Position<E> addBetween(E e, Node<E> prev, Node<E> next) {
        Node<E> node = new Node<>(e, prev, next);
        prev.setNext(node);
        next.setPrev(node);
        size++;
        return node;
    }

    @Override
    public Position<E> addFirst(E e) {
        return addBetween(e, header, header.getNext());
    }

    @Override
    public Position<E> addLast(E e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }

    @Override
    public Position<E> addBefore(Position<E> p, E e) throws IllegalStateException {
        Node<E> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    @Override
    public Position<E> addAfter(Position<E> p, E e) throws IllegalStateException {
        Node<E> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    @Override
    public E set(Position<E> p, E e) throws IllegalStateException {
        Node<E> node = validate(p);
        E answer = node.getElement();
        node.setElement(e);
        return answer;
    }

    @Override
    public E remove(Position<E> p) throws IllegalStateException {
        Node<E> node = validate(p);
        Node<E> prev = node.getPrev();
        Node<E> next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        E answer = node.getElement();
        node.setNext(null);
        node.setPrev(null);
        return answer;
    }
}
