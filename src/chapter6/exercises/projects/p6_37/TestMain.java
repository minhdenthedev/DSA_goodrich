package chapter6.exercises.projects.p6_37;

public class TestMain {
    public static void main(String[] args) {
        ArrayColorStack<String> stack = new ArrayColorStack<>();

        stack.redPush("red0");
        stack.redPush("red1");
        stack.redPush("red2");
        stack.redPush("red3");
        stack.redPush("red4");
        stack.bluePush("blue0");
        stack.bluePush("blue1");
        stack.bluePush("blue2");
        stack.bluePush("blue3");
        stack.bluePush("blue4");
        System.out.println(stack);
        System.out.println(stack.redTop());
        System.out.println(stack.redPop());
        System.out.println(stack.redPop());
        System.out.println(stack);
        System.out.println(stack.bluePop());
        System.out.println(stack.bluePop());
        System.out.println(stack.bluePop());
        System.out.println(stack);
    }
}
