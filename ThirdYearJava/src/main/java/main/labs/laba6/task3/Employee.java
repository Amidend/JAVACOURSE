package main.labs.laba6.task3;

public class Employee {
    private String fullname;
    private double salary;
    public String getName() {
        return fullname;
    }
    public void setName(String name) {
        this.fullname = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(String name, double salary){
        fullname = name;
        this.salary = salary;
    }

}
