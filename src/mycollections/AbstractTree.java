package mycollections;

/**
 * An abstract base class provide some functionalities for the Tree interface.
 * @param <E>   generic type.
 */
public abstract class AbstractTree<E> implements Tree<E> {
    @Override
    public boolean isExternal(Position<E> p) {
        return numOfChildren(p) == 0;
    }

    @Override
    public boolean isInternal(Position<E> p) {
        return numOfChildren(p) > 0;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean isRoot(Position<E> p) {
        return p == root();
    }

    /**
     * Returns the depth of the Position p
     * @param p Position
     * @return  Depth of p.
     */
    public int depth(Position<E> p) {
        if (isRoot(p)) {
            return 0;
        } else {
            return 1 + depth(parent(p));
        }
    }

    /**
     * Recursive algorithm to find the height of Position p
     * @param p Position
     * @return  height of Position p
     */
    public int height(Position<E> p) {
        int h = 0;
        for (Position<E> c: children(p)) {
            h = Math.max(h, 1 + height(c));
        }
        return h;
    }


}
