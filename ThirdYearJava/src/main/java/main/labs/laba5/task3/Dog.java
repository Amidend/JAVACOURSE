package main.labs.laba5.task3;

public class Dog extends Pet {
    private int maxSpeed;

    public Dog(String wherelive, int age, int maxSpeed) {
        super(wherelive, age);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Dog " + super.toString() + " Максимальная скорость бега " + maxSpeed;
    }
}
