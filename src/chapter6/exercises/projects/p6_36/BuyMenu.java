package chapter6.exercises.projects.p6_36;

import java.util.Scanner;

public class BuyMenu {
    public static void display(Scanner sc, StockHolder stock) throws IllegalArgumentException{
        System.out.print("How many do you wish to buy: ");
        int quantity = sc.nextInt();
        if (quantity < 0) throw new IllegalArgumentException("Must buy more than zero shares!");
        System.out.print("Price: ");
        double price = sc.nextDouble();
        stock.buy(quantity, price);
        System.out.println();
    }
}
