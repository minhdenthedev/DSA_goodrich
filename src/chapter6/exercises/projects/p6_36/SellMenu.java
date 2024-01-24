package chapter6.exercises.projects.p6_36;

import java.util.Scanner;

public class SellMenu {
    public static void display(Scanner sc, StockHolder stock) throws IllegalArgumentException {
        System.out.print("How many would you wish to sell: ");
        int quantity = sc.nextInt();
        if (quantity > stock.currentStocks()) throw new IllegalArgumentException("You only have "
                + stock.currentStocks() + " shares left!");
        System.out.print("Price: ");
        double price = sc.nextDouble();
        stock.sell(quantity, price);
        System.out.println();
    }
}
