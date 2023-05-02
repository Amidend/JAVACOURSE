package main.labs.laba5.task3;

public class Parrot extends Pet {
    String mainColour;

    public Parrot(String wherelive, int age, String mainColour) {
        super(wherelive, age);
        this.mainColour = mainColour;
    }

    @Override
    public String toString() {

        return "Parrot " + super.toString() +" Основной цвет попугая"+mainColour;
    }
}
