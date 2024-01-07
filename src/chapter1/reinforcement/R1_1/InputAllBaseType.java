package chapter1.reinforcement.R1_1;

import java.util.Scanner;

public class InputAllBaseType {
    public static void inputAllBaseTypes(Scanner sc) {

        System.out.print("Boolean input: ");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean: " + b);

        System.out.print("Char input: ");
        char c = sc.next().charAt(0);
        System.out.println("Char: " + c);

        System.out.print("Byte input: ");
        byte bt = sc.nextByte();
        System.out.println("Byte: " + bt);

        System.out.print("Short input: ");
        short s = sc.nextShort();
        System.out.println("Short: " + s);

        System.out.print("Int input: ");
        int i = sc.nextInt();
        System.out.println("Int: " + i);

        System.out.print("Long input: ");
        long l = sc.nextLong();
        System.out.println("Long: " + l);

        System.out.print("Float input: ");
        float f = sc.nextFloat();
        System.out.println("Float: " + f);

        System.out.print("Double input: ");
        double d = sc.nextDouble();
        System.out.println("Double: " + d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputAllBaseTypes(sc);
    }
}
