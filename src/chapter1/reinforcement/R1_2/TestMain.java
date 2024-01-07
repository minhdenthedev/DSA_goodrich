package chapter1.reinforcement.R1_2;

public class TestMain {
    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry();
        }
        GameEntry[] B = new GameEntry[5];
        System.arraycopy(A, 0, B, 0, 5);
        A[4].score = 550;
        System.out.println(B[4].score);
    }
}
