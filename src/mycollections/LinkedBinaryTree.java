package mycollections;

import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {
    protected static class Node<E> implements Position<E> {
        private E element;
        private Node<E> right;
        private Node<E> left;
        private Node<E> parent;
        public Node(E e, Node<E> parent, Node<E> left, Node<E> right) {
            element = e;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        @Override
        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> right) {
            this.right = right;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> left) {
            this.left = left;
        }

        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> parent) {
            this.parent = parent;
        }
    }

    /** Factory method to create new Node */
    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
        return new Node<>(e, parent, left, right);
    }

    protected Node<E> root = null;
    private int size = 0;

    public LinkedBinaryTree() {}

    // private utility
    /** Validates the position and returns it as node */
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) {
            throw new IllegalArgumentException("Not valid position type.");
        }

        Node<E> node = (Node<E>) p;
        if (node.getParent() == node) {
            throw new IllegalArgumentException("p is no longer in the tree");
        }

        return node;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterable<Position<E>> positions() {
        return null;
    }

    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getLeft();
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getRight();
    }

    @Override
    public Position<E> root() {
        return root;
    }

    @Override
    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }

    /** Places element e at the root of an empty tree and returns its new Position */
    public Position<E> addRoot(E e) throws IllegalStateException {
        if (!isEmpty()) throw new IllegalStateException("Tree is not empty.");
        root = createNode(e, null, null, null);
        size = 1;
        return root;
    }

    /** Create new left child of Position p storing element e; returns its position. */
    public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (node.getLeft() != null) throw new IllegalArgumentException("p already has left child");
        Node<E> child = createNode(e, node, null, null);
        node.setLeft(child);
        size++;
        return child;
    }

    /** Create new right child of Position p storing element e; returns its position. */
    public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (node.getRight() != null) throw new IllegalArgumentException("p already has right child");
        Node<E> child = createNode(e, node, null, null);
        node.setRight(child);
        size++;
        return child;
    }

    /** Replace the element at position p with e and returns the replaced element. */
    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E temp = node.getElement();
        node.setElement(e);
        return temp;
    }


    /** Attaches tree t1 and t2 as left and right subtrees of external p */
    public void attach(Position<E> p, LinkedBinaryTree<E> t1, LinkedBinaryTree<E> t2) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (isInternal(p)) throw new IllegalArgumentException("p must be a leaf!");
        size += t1.size() + t2.size();
        if (!t1.isEmpty()) {
            t1.root.setParent(node);
            node.setLeft(t1.root);
            // Help garbage collector
            t1.root = null;
            t1.size = 0;
        }

        if (!t2.isEmpty()) {
            t2.root.setParent(node);
            node.setLeft(t2.root);
            t2.root = null;
            t2.size = 0;
        }
    }

    /** Removes the node at Position p and replaces it with its child,  if any */
    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);

        // Get the child of the node
        if (numOfChildren(p) == 2) throw new IllegalArgumentException("p has two children!");
        Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight());

        // Set the new parent of child node to its grandparent
        if (child != null) {
            child.setParent(node.getParent());
        }

        // Set the child position of the new parent
        if (node == root) {
            root = child;
        } else {
            Node<E> parent = node.getParent();
            if (node == parent.getLeft()) {
                parent.setLeft(child);
            } else {
                parent.setRight(child);
            }
        }

        // Remove the node instance from the tree
        size--;
        E temp = node.getElement();
        node.setElement(null);
        node.setLeft(null);
        node.setRight(null);
        node.setParent(node);   // Convention for defunct node

        return temp;
    }


}
