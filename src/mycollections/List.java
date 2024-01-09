package mycollections;

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

    /**
     * Removes and returns the last element of the list.
     * @return last element of the list.
     */
    E removeLast();

    /**
     * Returns, but not removes, the element at index i
     * @param i     index of the returned element
     * @return  element at index i
     * @throws IndexOutOfBoundsException
     */
    E get(int i) throws IndexOutOfBoundsException;

    /**
     * Replaces the element at index i with e, and returns the replaced element.
     * @param i     the index of replaced element
     * @param e     the new element to be replaced in.
     * @return      element replaced out.
     * @throws IndexOutOfBoundsException
     */
    E set(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Insert new element at index i, shifting all subsequent elements later
     * @param i     index of inserted element.
     * @param e     element to be inserted.
     * @throws IndexOutOfBoundsException
     */
    void add(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Removes and returns the element at index i.
     * @param i     the index of the removed/returned element.
     * @return      removed/returned element.
     * @throws IndexOutOfBoundsException
     */
    E remove(int i) throws IndexOutOfBoundsException;
}
