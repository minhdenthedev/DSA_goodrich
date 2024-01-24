package mycollections;

/**
 * An interface for Binary Tree, in which each node has at most two children.
 * @param <E> generic type.
 */
public interface BinaryTree<E> extends Tree<E> {
    /**
     * Returns the left child of Position p.
     * @param p Position.
     * @return  Position: left child of p.
     * @throws IllegalArgumentException if p is invalid.
     */
    Position<E> left(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns the right child of Position p.
     * @param p Position.
     * @return  Position: right child of p.
     * @throws IllegalArgumentException if p is invalid.
     */
    Position<E> right(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns the sibling of Position p.
     * @param p sibling of Position p.
     * @return  Position: sibling of Position p.
     * @throws IllegalArgumentException if p is invalid.
     */
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
}
