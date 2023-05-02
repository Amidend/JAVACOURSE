package main.labs.laba5.task4;

public abstract class Laborer {
    protected String name;
    protected double payment;
    protected Laborer(double payment, String name){
        this.payment =payment;
        this.name = name;
    }
    public abstract String getName();
    public abstract double getPayment();
}
