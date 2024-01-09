package chapter4.examples.strings;

public class RepeatingString {
    public static String repeat1(char c, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += c;
        }

        return answer;
    }

    public static String repeat2(char c, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        repeat1('*', 50000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
