package chapter1.reinforcement.R1_5;

public class SumOfN {
    public static long sum(long n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
