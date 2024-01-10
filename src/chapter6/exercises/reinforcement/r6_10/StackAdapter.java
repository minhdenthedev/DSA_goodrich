package chapter6.exercises.reinforcement.r6_10;

import mycollections.Deque;
import mycollections.DoubleLinkedList;
import mycollections.Stack;

public class StackAdapter<E> implements Stack<E> {
    private Deque<E> deque;
    public StackAdapter() {
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
    public void push(E e) {
        deque.addFirst(e);
    }

    @Override
    public E top() {
        return deque.first();
    }

    @Override
    public E pop() {
        return deque.removeFirst();
    }
}
