package mycollections;

public interface List<E> {
    /**
     * @author mindenthedev
     * @return the size of the list
     */
    int size();

    /**
     * @author minhdenthedev
     * @return true if the list is empty and false if it is not.
     */
    boolean isEmpty();
    E first();
    E last();
    void addFirst();
    void addLast();
    E removeFirst();
}
