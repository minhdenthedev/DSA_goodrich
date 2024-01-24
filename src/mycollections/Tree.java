package mycollections;

import java.util.Iterator;

public interface Tree<E> extends Iterable<E> {
    /**
     * Returns the Position of the root.
     * @return  Position of root.
     */
    Position<E> root();

    /**
     * Returns the Position of the parent of Position p.
     * @param p Position.
     * @return  Position of parent of p.
     * @throws IllegalStateException if p is invalid.
     */
    Position<E> parent(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns an iterable collection of children of Position p.
     * @param p Position.
     * @return  Iterable collections of Positions.
     * @throws IllegalArgumentException if p is invalid.
     */
    Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns number of children of Position p.
     * @param p Position.
     * @return  number of children.
     * @throws IllegalArgumentException if p is invalid.
     */
    int numOfChildren(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns whether the node has at least one child or not.
     * @param p Position.
     * @return  true if p has at least one child, and false otherwise.
     * @throws IllegalArgumentException if p is invalid.
     */
    boolean isInternal(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns whether the node has no child or not.
     * @param p Position.
     * @return  true if the node has no child, and false otherwise.
     * @throws IllegalArgumentException if p is invalid.
     */
    boolean isExternal(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns whether the node p is the root or not.
     * @param p Position.
     * @return  true if p is root, and false otherwise.
     * @throws IllegalArgumentException if p is invalid.
     */
    boolean isRoot(Position<E> p) throws IllegalArgumentException;

    /**
     * Returns the size of the tree.
     * @return  size of the tree.
     */
    int size();

    /**
     * Returns whether the tree is empty or not.
     * @return true if the tree is empty, and false otherwise.
     */
    boolean isEmpty();


    /**
     * Returns an iterator for all elements in the tree.
     * @return  iterator.
     */
    @Override
    Iterator<E> iterator();

    /**
     * Returns an iterable collections for all positions in the tree.
     * @return  Iterable collections.
     */
    Iterable<Position<E>> positions();
}
