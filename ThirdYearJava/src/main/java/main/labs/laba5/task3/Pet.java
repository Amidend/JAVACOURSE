package main.labs.laba5.task3;

public class Pet {
    protected String wherelive;
    protected int age;

    public Pet(String wherelive, int age) {
        this.wherelive = wherelive;
        this.age = age;
    }

    public String getWherelive() {
        return wherelive;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Адрес проживания: " + wherelive+
                ", Возраст "+this.age;
    }
}
