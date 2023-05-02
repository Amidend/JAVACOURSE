package main.labs.laba11;
public class Employee {

    private String fullname;
    private double salary;


    public Employee(String fullname, double salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullName() {
        return fullname;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary = " + salary +
                '}';
    }

}