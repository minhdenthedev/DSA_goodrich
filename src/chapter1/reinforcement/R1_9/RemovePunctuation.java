package chapter1.reinforcement.R1_9;

public class RemovePunctuation {
    public static String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || c == 32) {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removePunctuation("Let's try Mike!"));
    }
}
