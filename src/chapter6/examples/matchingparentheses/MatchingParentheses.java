package chapter6.examples.matchingparentheses;

import mycollections.SinglyLinkedList;
import mycollections.Stack;

public class MatchingParentheses {
    public static boolean isMatch(String expression) {
        final String openings = "{[(";
        final String closings = "}])";

        Stack<Character> buffer = new SinglyLinkedList<>();
        for (char c: expression.toCharArray()) {
            if (openings.indexOf(c) != -1) {
                buffer.push(c);
            } else if (closings.indexOf(c) != -1) {
                if (buffer.isEmpty()) return false;
                else if (closings.indexOf(c) != openings.indexOf(buffer.pop())) {
                    return false;
                }
            }
        }

        return buffer.isEmpty();
    }

    public static void main(String[] args) {
        String ex1 = "{[a+b]}()";
        String ex2 = "(a + b) [}";
        System.out.println(isMatch(ex1));
        System.out.println(isMatch(ex2));
    }
}
