package main.labs.laba6.task3;

public class Report {
    public static String generateReport(Employee employer){
        return String.format("%15s получает %.2f \t", employer.getName(),employer.getSalary());
    }
}
