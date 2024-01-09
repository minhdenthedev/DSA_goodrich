package mycollections;

/**
 * An interface for positional list.
 * @param <E>   generic type
 */
public interface PositionalList<E> {
    /**
     * Returns the number of elements in the list.
     * @return  number of elements in the list.
     */
    int size();

    /**
     * Returns whether the list is empty or not.
     * @return  true if the list is empty, and false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns the first position of the list (or null, if empty).
     * @return  first position of the list.
     */
    Position<E> first();

    /**
     * Returns the last element of the list (or null, if empty).
     * @return last element of the list.
     */
    Position<E> last();

    /**
     * Returns the Position before p (or null, if p is first).
     * @param p Position.
     * @return  Position before p.
     * @throws IllegalStateException    if p is null.
     */
    Position<E> before(Position<E> p) throws IllegalStateException;

    /**
     * Returns the Position after p (or null, if p is last).
     * @param p Position.
     * @return  Position after p.
     * @throws IllegalStateException    if p is null.
     */
    Position<E> after(Position<E> p) throws IllegalStateException;

    /**
     * Insert new element to the front of the list and return its Position.
     * @param e new element to be inserted.
     * @return  Position of e.
     */
    Position<E> addFirst(E e);

    /**
     * Insert new element to the back of the list and returns its Position.
     * @param e new element to be added.
     * @return  Position of e.
     */
    Position<E> addLast(E e);

    /**
     * Inserts element e before the Position p and returns its new Position.
     * @param p Position.
     * @param e new element to be inserted.
     * @return  Position of e.
     * @throws IllegalStateException    if p is null.
     */
    Position<E> addBefore(Position<E> p, E e) throws IllegalStateException;

    /**
     * Inserts element e after the Position p and returns its new Position.
     * @param p Position.
     * @param e new element to be inserted.
     * @return  Position of e.
     * @throws IllegalStateException    if p is null.
     */
    Position<E> addAfter(Position<E> p, E e) throws IllegalStateException;

    /**
     * Replace the element stored at Position p with new element e.
     * @param p Position.
     * @param e replacing element.
     * @return  replaced element.
     * @throws IllegalStateException    if p is null.
     */
    E set(Position<E> p, E e) throws IllegalStateException;

    /**
     * Remove the element stored at Position p and returns its element.
     * @param p Position.
     * @return  removed element.
     * @throws IllegalStateException    if p is null.
     */
    E remove(Position<E> p) throws IllegalStateException;
}
