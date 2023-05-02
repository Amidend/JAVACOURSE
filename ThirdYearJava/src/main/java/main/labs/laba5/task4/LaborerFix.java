package main.labs.laba5.task4;

public class LaborerFix extends Laborer {
    public LaborerFix(double payment, String name) {
        super(payment, name);
    }
    @Override
    public double getPayment() {
        return payment;
    }
    @Override
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Постоянная заплата" +
                " name = '" + name + '\'' +
                ", оплата = " + payment;
    }
}
