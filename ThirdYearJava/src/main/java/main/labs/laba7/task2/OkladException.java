package main.labs.laba7.task2;

public class OkladException extends Exception{
    double oklad;
    public OkladException(double value){
        this.oklad = value;
    }
    @Override
    public String toString()
    {
        return "Невозможно создать сотрудника – указан отрицательный оклад: "+oklad;
    }
}
