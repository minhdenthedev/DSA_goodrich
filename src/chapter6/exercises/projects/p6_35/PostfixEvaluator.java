package chapter6.exercises.projects.p6_35;

import mycollections.SinglyLinkedList;
import mycollections.Stack;

/**
 * @author hminh
 * Postfix evaluator exercise.
 */
public class PostfixEvaluator {
    public static int evaluate(String pf) {
        final String NUMBERS = "0123456789";
        Stack<Integer> stack = new SinglyLinkedList<>();
        for (char c: pf.toCharArray()) {
            // if c is a number, we push it into the stack
            if (NUMBERS.indexOf(c) != -1) {
                stack.push(NUMBERS.indexOf(c));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch (c) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "52+83-*4/";
        System.out.println(evaluate(postfix));
    }
}
