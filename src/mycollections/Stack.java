package mycollections;

public interface Stack<E> {
    /**
     * Returns the number of elements in the stack
     * @return number of elements in the stack
     */
    int size();

    /**
     * Test whether the stack is empty
     * @return true if the stack is empty, and false otherwise
     */
    boolean isEmpty();

    /**
     * Insert an element to the top of the stack
     * @param e     the element to be inserted
     */
    void push(E e);

    /**
     * Returns, but not remove, the element at the top of the stack
     * @return element at the top of the stack
     */
    E top();

    /**
     * Returns and remove the element at the top of the stack
     * @return the element at the top of the stack
     */
    E pop();
}
