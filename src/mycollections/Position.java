package mycollections;

public interface Position<E> {

    /**
     * Returns the element store at this position.
     * @return  stored element.
     * @throws IllegalStateException if position no longer valid.
     */
    E getElement() throws IllegalStateException;
}
