package chapter1.reinforcement.R1_7;

public class SumOfSquares {
    public static long sumSquare(long n) {
        long sum = 0;

        for (long i = 1; i <= n; i++) {
            sum += i * i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumSquare(10));
    }
}
