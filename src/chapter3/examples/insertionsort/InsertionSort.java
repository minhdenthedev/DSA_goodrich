package chapter3.examples.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int current = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > current) {
                a[j] = a[j - 1];
                j--;
            }

            a[j] = current;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 9; i >= 0; i--) {
            a[9 - i] = i;
        }

        System.out.println(Arrays.toString(a));
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
