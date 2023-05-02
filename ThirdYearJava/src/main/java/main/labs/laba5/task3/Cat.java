package main.labs.laba5.task3;

public class Cat extends Pet {
    private int countOfKittens;

    public int getCountOfKittens() {
        return countOfKittens;
    }

    public Cat(String wherelive, int age, int coutOfKittens) {
        super(wherelive, age);
        this.countOfKittens = coutOfKittens;
    }

    @Override
    public String toString() {
        return "Cat "
                + super.toString() +
                ", количество котят " + countOfKittens;
    }
}
