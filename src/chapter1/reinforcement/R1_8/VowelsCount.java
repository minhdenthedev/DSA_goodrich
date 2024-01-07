package chapter1.reinforcement.R1_8;

public class VowelsCount {
    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'u' || c == 'o' || c == 'i') count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("aeuoi"));
    }
}
