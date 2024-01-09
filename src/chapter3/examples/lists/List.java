package chapter3.examples.lists;

public interface List<E> {
    /**
     * @author mindenthedev
     * @return the size of the list
     */
    int size();

    /**
     * @author minhdenthedev
     * @return true if the list is empty, and false otherwise.
     */
    boolean isEmpty();

    /**
     * Return (but not remove) the first element of the list
     * @return first element of the list
     */
    E first();

    /**
     * Return (but not remove) the last element of the list
     * @return last element of the list
     */
    E last();

    /**
     * Add new element to the front of the list
     * @param e     the element to be added.
     */
    void addFirst(E e);

    /**
     * Add element to the end of the list
     * @param e     the element to be added.
     */
    void addLast(E e);

    /**
     * Return and remove the first element of the list
     * @return first element of the list
     */
    E removeFirst();
}
