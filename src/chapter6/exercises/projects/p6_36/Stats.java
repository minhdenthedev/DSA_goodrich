package chapter6.exercises.projects.p6_36;

public class Stats {
    public static void display(StockHolder stock) {
        System.out.println("Current number of shares: " + stock.currentStocks());
        System.out.print("Current capital gain : " + stock.currentGain());
        System.out.println();
    }
}
