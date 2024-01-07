package chapter1.reinforcement.R1_4;

public class IsEven {
    public static boolean isEven(int n) {
        String s = Integer.toString(n);
        char lastDigit = s.charAt(s.length() - 1);
        return lastDigit == '0' || lastDigit == '2' || lastDigit == '4' || lastDigit == '8';
    }

    public static void main(String[] args) {
        System.out.println(isEven(1228));
        System.out.println(isEven(1227));
    }
}
