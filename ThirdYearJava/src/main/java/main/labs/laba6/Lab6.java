package main.labs.laba6;

import main.labs.laba6.task1.ReplacesStrings;
import main.labs.laba6.task2.MiddleString;
import main.labs.laba6.task3.Employee;
import main.labs.laba6.task3.Report;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.labs.laba6.task5.Palindrome.findDigitPalindromes;

public class Lab6 {
    private String s;
    public Lab6() {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("ВВедите номер задания");
            int num = in.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("ВВедите строку");
                    s = in.next();
                    System.out.println(ReplacesStrings.replaceAtoO(s));
                }
                case 2 -> {
                    System.out.println("ВВедите строку");
                    s = in.next();
                    System.out.println(MiddleString.findMiddleString(s));
                }
                case 3 ->{
                    Employee[] e = {new Employee("горь ванович", 700.0),
                            new Employee("Вадим Вительевич", 1100.0),
                            new Employee("Дмитрий Петухов", 930.0)};
                    for (var item : e) {
                        System.out.println(Report.generateReport(item));
                    }
                }
                case 4 -> {
                    String text = "aAXa aeffa aGha aza ax23a a3sSa";
                    Pattern pattern = Pattern.compile("^a[a-z]+a$");
                    for(String email : text.split(" ")){
                        Matcher matcher = pattern.matcher(email);
                        System.out.println(email +" : "+ matcher.matches());
                    }
                }
                case 5 ->{
                    String s= "кто я акка прог палиндром ажжа гууг 1221 3333 5885 7895456";
                    List<String> list = new ArrayList<String>();
                    list=findDigitPalindromes(s);
                    String f= list.get(2);
                    for (var i:
                        list){
                        System.out.println(i);
                    }
                }
                default -> flag = false;
            }
        } while (flag);
    }
}
