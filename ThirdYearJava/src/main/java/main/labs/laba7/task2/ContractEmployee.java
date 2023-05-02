package main.labs.laba7.task2;

public class ContractEmployee  extends Employee{
    public ContractEmployee(String fullName, String jobTitle, double salary) throws OkladException {
        super(fullName, jobTitle, salary);
    }
    @Override
    public double calculateSalary() throws PremiyaException {
        return super.calculateSalary() - (super.calculateSalary() * 0.1);
    }
}
