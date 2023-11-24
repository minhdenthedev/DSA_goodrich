package recursion;

public class RecursionExamples {

    // 5.1.1 The factorial function
    public static int factorial(int n) {
        if (n == 0) return 1;

        return n * factorial(n - 1);
    }

    // 5.1.2 Drawing an English ruler
    public static void drawLine(int tickLength, int tickLabel) {
        for (int i = 0; i < tickLength; i++) {
            System.out.print("-");
        }
        if (tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.print("\n");
    }

    public static void drawLine(int tickLength) {
        for (int i = 0; i < tickLength; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void drawInterval(int centralLength) {
        if (centralLength >= 1) {
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }

    public static void drawRuler(int nInches, int majorLength) {
        drawLine(majorLength, 0);

        for (int i = 1; i<= nInches; i++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, i);
        }
    }

    // 5.1.3 Binary Search
    public static int binarySearch(int[] a, int n, int low, int high) {
        if (low > high) return -1;
        else {
            int mid = (low + high) / 2;
            if (a[mid] == n) {
                return mid;
            } else if (n < a[mid]) {
                return binarySearch(a, n, low, mid - 1);
            } else {
                return binarySearch(a, n, mid + 1, high);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));

        System.out.println("\nEnglish ruler: ");
        drawRuler(5, 3);

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
        System.out.println("\nSearch for element 5: " +
                binarySearch(a, 5, 0, a.length - 1));
    }
}
