package chapter1.reinforcement.R1_3;

public class IsMultiple {
    public static boolean isMultiple(long n, long m) {
        // we will cast i1 = n / m to double and then cast i1 to long i2,
        // if i2 != i1 then n is not multiply of m.
        double i1 = (double) n / m;
        long i2 = (long) i1;
        return i2 == i1;
    }

    public static void main(String[] args) {
        System.out.println(isMultiple(320000000, 160000000));
        System.out.println(isMultiple(32, 5));
    }
}
