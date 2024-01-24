package chapter6.exercises.projects.p6_36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StockHolder stock = new StockHolder();
        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            System.out.println("----------------------------");
            System.out.println("Choose your operation:");
            System.out.println("1. Buy shares.");
            System.out.println("2. Sell shares.");
            System.out.println("3. Quit.");
            option = sc.nextInt();
            if (option == 3) break;
            if (option != 1 && option != 2) {
                System.out.println("Invalid choice!");
                continue;
            }
            switch (option) {
                case 1:
                    try {
                        BuyMenu.display(sc, stock);
                        Stats.display(stock);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case 2:
                    try {
                        SellMenu.display(sc, stock);
                        Stats.display(stock);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
            }
        }

        sc.close();
    }
}
