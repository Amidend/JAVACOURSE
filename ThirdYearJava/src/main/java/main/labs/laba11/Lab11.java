package main.labs.laba11;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;
public class Lab11 {
    public Lab11(){
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("ВВедите номер лабы");
            int num = in.nextInt();
            switch (num) {
                case 1 -> {
                    printTopics("en", "US");
                    System.out.println();
                    printTopics("ru", "RU");
                }
                case 2->{
                    Locale locale = new Locale("en", "US");
                    Employee[] employees = {
                            new Employee("иванов иван иванович", 1000.0),
                            new Employee("Вадим Вительевич", 1100.0),
                            new Employee("сидоров сидор сидорович", 900.0)
                    };

                    FullReport.rep(employees, locale);

                }
                default -> flag = false;
            }
        }while (flag);

    }
    public static void printTopics(String language,String county) {
        ResourceBundle bundle = ResourceBundle.getBundle("topics", new Locale(language,county));
        Set<String> keys = bundle.keySet();

        for (String key : keys) {
            String value = bundle.getString(key);
            System.out.println(key + ": " + value);
        }
    }

}
