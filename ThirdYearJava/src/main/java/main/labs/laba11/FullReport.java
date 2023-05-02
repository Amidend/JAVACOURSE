package main.labs.laba11;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {

        public static void rep(Employee[] employees, Locale locale) {
            ResourceBundle bundle = ResourceBundle.getBundle("Report", locale);
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

            for (Employee employee : employees) {
                String[] fio = employee.getFullName().split("\\s+");
                if (fio[0].length() < 15) {
                    fio[0] = fio[0];
                } else {
                    fio[0] = bundle.getString("ошибка!");
                }

                System.out.println(bundle.getString("fullname") + ": " + fio[1].substring(0, 1) + " " + fio[2].substring(0, 1) + " " + fio[0] + " "  +bundle.getString("salary") + ": " +  currencyFormat.format(employee.getSalary()));
            }
        }
    }
