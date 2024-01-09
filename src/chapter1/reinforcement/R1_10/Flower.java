package chapter1.reinforcement.R1_10;

public class Flower {
    String name;
    int numPetals;
    float price;

    public Flower(String name, int numPetals, float price) {
        this.name = name;
        this.numPetals = numPetals;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPetals() {
        return numPetals;
    }

    public void setNumPetals(int numPetals) {
        this.numPetals = numPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
