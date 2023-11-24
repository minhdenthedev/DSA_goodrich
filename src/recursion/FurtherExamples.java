package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FurtherExamples {

    // 5.3.1 Linear Recursion
    public static int linearSum(int[] a, int n) {
        if (n == 0) {
            return 0;
        }
        else return linearSum(a, n - 1) + a[n - 1];
    }

    public static void reverseArray(int[] a, int low, int high) {
        if (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            reverseArray(a, low + 1, high - 1);
        }
    }

    public static int power(int x, int n) {
        if (n == 0) return 1;
        else return x * power(x, n - 1);
    }

    // 5.3.2 Binary Recursion
    public static int binarySum(int[] a, int low, int high) {
        if (low > high) {
            return 0;
        } else if (low == high) {
            return a[low];
        } else {
            int mid = (low + high) / 2;
            return binarySum(a, low, mid) + binarySum(a, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Linear sum of array a: " + linearSum(a, 10));
        reverseArray(a, 0, 9);
        System.out.println("Reverse of array a: " + Arrays.toString(a));
        System.out.println("Power 4 of 2 is: " + power(2, 4));
        System.out.println("Binary sum of the array a: " + binarySum(a, 0, 9));
    }
}
