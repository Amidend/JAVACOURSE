package main.labs.laba7;

import main.labs.laba7.task2.Employee;
import main.labs.laba7.task2.OkladException;
import main.labs.laba7.task2.PremiyaException;
import main.labs.laba7.task2.StaffMember;

public class Lab7 {
    public Lab7(){
        StaffMember sm = null;
        try {
            sm = new StaffMember("Петров Петр", "Менеджер", 990.90, -200);
        } catch (OkladException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println(sm.calculateSalary());
        } catch (PremiyaException e) {
            throw new RuntimeException(e);
        }
        try {
            Employee emp = new Employee("ванов ван ванович", "Дизайнер", -190);
        } catch (OkladException e) {
            throw new RuntimeException(e);
        }
    }
}
