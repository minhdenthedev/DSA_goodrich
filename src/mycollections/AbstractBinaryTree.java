package mycollections;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {
    @Override
    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        if (p == left(parent)) return right(parent);
        else return left(parent);
    }

    @Override
    public int numOfChildren(Position<E> p) {
        int count = 0;
        if (left(p) != null) count++;
        if (right(p) != null) count++;
        return count;
    }

    @Override
    public Iterable<Position<E>> children(Position<E> p) {
        ArrayList<Position<E>> snapshot = new ArrayList<>(2);
        if (left(p) != null) snapshot.addLast(left(p));
        if (right(p) != null) snapshot.addLast(right(p));
        return snapshot;
    }
}
