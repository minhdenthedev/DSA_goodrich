package chapter6.examples.reversestring;

import mycollections.SinglyLinkedList;
import mycollections.Stack;

import java.util.Arrays;
import java.util.Random;

public class ReverseString {
    public static <E> void reverse(E[] a) {
        Stack<E> buffer = new SinglyLinkedList<>();
        for (int i = 0; i < a.length; i++) {
            buffer.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = buffer.pop();
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();

        Integer[] a = new Integer[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(100);
        }

        String[] b = {"Hello", "Hi", "Hey", "Goodbye", "Good Luck"};
        System.out.println("Original arrays: " + Arrays.toString(a));
        System.out.println("Original arrays: " + Arrays.toString(b));
        reverse(a);
        reverse(b);
        System.out.println("Reversed array: " + Arrays.toString(a));
        System.out.println("Reversed array: " + Arrays.toString(b));

    }
}
