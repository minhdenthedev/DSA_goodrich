package chapter6.exercises.projects.p6_36;

import mycollections.Queue;
import mycollections.SinglyLinkedList;

public class StockHolder {
    private final Queue<Double> queue = new SinglyLinkedList<>();
    private double currentGain;
    public StockHolder() {
        currentGain = 0.0;
    }

    public int currentStocks() {
        return queue.size();
    }

    public double currentGain() {
        return currentGain;
    }

    public void buy(int quantity, double price) throws IllegalArgumentException {
        if (quantity <= 0) throw new IllegalArgumentException("Must buy more than zero shares!");
        for (int i = 0; i < quantity; i++) {
            queue.enqueue(price);
        }
    }

    public void sell(int quantity, double price) throws IllegalArgumentException {
        if (quantity > currentStocks()) {
            throw new IllegalArgumentException("You only have " + currentStocks() + " shares left!");
        }

        for (int i = 0; i < quantity; i++) {
            currentGain += (price - queue.dequeue());
        }
    }
}
