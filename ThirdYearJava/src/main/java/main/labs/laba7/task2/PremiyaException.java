package main.labs.laba7.task2;

public class PremiyaException extends Exception{
    @Override
    public String toString(){
        return "Премия не может быть отрицательной.";
    }
}
