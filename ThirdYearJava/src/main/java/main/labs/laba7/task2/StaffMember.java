package main.labs.laba7.task2;

public class StaffMember extends Employee{
    private double premium;
    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public StaffMember(String fullName, String jobTitle, double salary, double premium) throws OkladException {
        super(fullName, jobTitle, salary);
        this.premium = premium;
    }

    @Override
    public double calculateSalary() throws PremiyaException {
        try {
            if(premium < 0){throw new PremiyaException();}
            return super.calculateSalary() + premium;
        }
        catch (PremiyaException ex){
            System.out.println(ex);
            return 0;
        }
    }
}
