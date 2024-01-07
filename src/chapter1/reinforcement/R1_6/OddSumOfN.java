package chapter1.reinforcement.R1_6;

public class OddSumOfN {
    public static long oddSumOfN(long n) {
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(oddSumOfN(15));
    }
}
