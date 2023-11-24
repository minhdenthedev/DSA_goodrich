package stacks;

import java.util.Arrays;
import java.util.Stack;

public class Examples {
    // 6.1.4 Reverse an array
    public static void reverse(int[] a) {
        Stack<Integer> buffer = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            buffer.push(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = buffer.pop();
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(a);
        System.out.println("The reverse of array a: " + Arrays.toString(a));
    }
}
