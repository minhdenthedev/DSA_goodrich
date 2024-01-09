package chapter1.creativity.C1_14;

import java.util.Arrays;

public class ReversedArray {
    public static void reverserArray(int[] array) {
        int n = array.length - 1;

        if (n % 2 == 1) {
            n /= 2;
        } else {
            n /= n;
            n -= 1;
        }

        for (int i = 0; i < n; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        System.out.println(Arrays.toString(a));
        reverserArray(a);
        System.out.println(Arrays.toString(a));
    }
}
