package mycollections;

public interface Queue<E> {
    /**
     * Returns number of elements in the queue
     * @return number of elements in the queue
     */
    int size();

    /**
     * Returns whether the queue is empty or not
     * @return true if the queue is empty, and false otherwise.
     */
    boolean isEmpty();

    /**
     * Insert the element at the back of the queue.
     */
    void enqueue();

    /**
     * Returns, but not removes, the first element of the queue.
     * @return the first element of the queue.
     */
    E first();

    /**
     * Returns and remove the first element of the queue.
     * @return the first element of the queue.
     */
    E dequeue();
}
