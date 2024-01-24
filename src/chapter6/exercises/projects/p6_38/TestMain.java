package chapter6.exercises.projects.p6_38;

public class TestMain {
    public static void main(String[] args) {
        LeakyStack<Integer> stack = new LeakyStack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.push(11);
        stack.push(12);
        System.out.println(stack);
        stack.push(13);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        stack.push(14);
        System.out.println(stack);
    }
}
