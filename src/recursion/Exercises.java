package recursion;

public class Exercises {

    // R-5.1
    public static int findMax(int[] a, int n, int max) {
        if (n == 0) return max;
        else {
            if (a[n] <= max) {
                return findMax(a, n - 1, max);
            } else {
                return findMax(a, n - 1, a[n]);
            }
        }
    }

    // R-5.7
    public static double harmonicSum(int n) {
        if (n == 1) return 1.0;
        else {
            return harmonicSum(n - 1) + (1.0 / n);
        }
    }

    // R-5.8
    public static int stringToInt(String s, int n) {
        final String NUMBERS = "0123456789";
        if (n == 0) return NUMBERS.indexOf(s.charAt(n));
        else {
            return NUMBERS.indexOf(s.charAt(n)) + 10 * stringToInt(s, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 4, 6, 7, 9, 10, 101, 100, 98, 97};
        System.out.println("Maximum number of array a: " + findMax(a, a.length - 1, a[0]));
        System.out.println("\nHarmonic sum of 10th is: " + harmonicSum(10));
        System.out.println("\nString to int of 23456: " + stringToInt("23456", 4));
    }
}
