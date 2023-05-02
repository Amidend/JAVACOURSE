package main.labs.laba5.task4;

public class LaborerNotFix extends Laborer {
    public LaborerNotFix(double payment, String name) {
        super(payment * 20.8*8 , name);
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
        return "Не постоянная зарплата " +
                " name= '" + name + '\'' +
                ", оплата =" + payment ;
    }
}
