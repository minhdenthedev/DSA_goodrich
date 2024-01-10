package chapter6.exercises.reinforcement.r6_5;

import mycollections.SinglyLinkedList;
import mycollections.Stack;

public class RecursiveRemove {
    public static Stack<Integer> recursiveRemove(Stack<Integer> s) {
        if (s.isEmpty()) return s;
        else {
            s.pop();
            return recursiveRemove(s);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new SinglyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Original stack size: " + stack.size());
        recursiveRemove(stack);
        System.out.println("Current stack size: " + stack.size());
    }
}
