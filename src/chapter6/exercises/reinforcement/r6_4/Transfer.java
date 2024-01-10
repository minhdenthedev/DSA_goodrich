package chapter6.exercises.reinforcement.r6_4;

import mycollections.SinglyLinkedList;
import mycollections.Stack;

public class Transfer {
    public static void transfer(Stack<Integer> s, Stack<Integer> t) {
        int n = s.size();
        for (int i = 0; i < n; i++) {
            t.push(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new SinglyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        Stack<Integer> t = new SinglyLinkedList<>();
        transfer(s, t);
        for (int i = 0; i < 10; i++) {
            System.out.print(t.pop() + " ");
        }
    }
}
