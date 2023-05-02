package main.labs.laba5.task1;

public class Product {
    private int quantity;
    private float weight;

    public Product(int count, float weight) {
        this.quantity = count;
        this.weight = weight;
    }

    public int getCount() {
        return quantity;
    }

    public void setCount(int count) {
        this.quantity = count;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Количество: " + quantity +
                ", Вес: " + weight;
    }
}
