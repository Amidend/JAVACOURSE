package main.labs.laba7.task2;

public class Employee {
    private String fullName;
    private String jobTitle;
    private double salary;

    public Employee(String fullName, String jobTitle, double salary) throws OkladException {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        if(salary < 0) {
            try {
                throw new OkladException(salary);
            }
            catch (OkladException ex) {
                System.err.println(ex);
            }
            finally {
                throw new OkladException(salary);
            }
        }
        else {
            this.salary = salary;
        }

    }

    public double calculateSalary() throws PremiyaException {
        return (salary - (salary * 0.13) - (salary * 0.01));
    }
}
