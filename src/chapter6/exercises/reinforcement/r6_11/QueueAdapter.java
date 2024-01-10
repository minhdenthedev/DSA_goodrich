package chapter6.exercises.reinforcement.r6_11;

import mycollections.Deque;
import mycollections.DoubleLinkedList;
import mycollections.Queue;

public class QueueAdapter<E> implements Queue<E> {
    private Deque<E> deque;
    public QueueAdapter() {
        deque = new DoubleLinkedList<>();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        deque.addLast(e);
    }

    @Override
    public E first() {
        return deque.first();
    }

    @Override
    public E dequeue() {
        return deque.removeFirst();
    }
}
