package mycollections;

/**
 * Interface for a double-ended queue: a collection of elements that can be inserted
 * and removed at both ends; this interface is a simplified version of java.util.Deque.
 * @param <E>   generic type.
 */
public interface Deque<E> {
    /**
     * Returns the number of elements.
     * @return  number of elements.
     */
    int size();

    /**
     * Returns whether the deque is empty or not.
     * @return  true if the deque is empty, and false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns, but not removes the first element of the deque.
     * @return  first element of the deque.
     */
    E first();

    /**
     * Returns, but not removes, the last element of the deque.
     * @return  last element of the deque.
     */
    E last();

    /**
     * Add new element at the front of the deque.
     * @param e new element to be added.
     */
    void addFirst(E e);

    /**
     * Add new element at the back of the deque.
     * @param e new element to be added.
     */
    void addLast(E e);

    /**
     * Returns and removes the first element of the deque.
     * @return  first element of the deque.
     */
    E removeFirst();

    /**
     * Returns and removes the last element of the deque.
     * @return  last element of the deque.
     */
    E removeLast();


}
