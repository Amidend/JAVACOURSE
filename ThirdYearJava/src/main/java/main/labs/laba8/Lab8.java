package main.labs.laba8;

import main.labs.laba8.task1.ReadInfo;
import main.labs.laba8.task2.ReadWriteInt;
import main.labs.laba8.task3.L8Task3;
import main.labs.laba8.task4.L8Task4;
import main.labs.laba8.task5.Lab8Task5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lab8 {
    public Lab8(){
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("ВВедите номер задания");
            int num = in.nextInt();
            switch (num) {
                case 1-> {
                    System.out.println(ReadInfo.Read("C:\\Users\\diman\\IdeaProjects\\ThirdYearJava\\src\\main\\java\\main\\labs\\laba8\\task1\\me.txt"));
                }
                case 2-> {
                    ReadWriteInt.Write("C:\\Users\\diman\\IdeaProjects\\ThirdYearJava\\src\\main\\java\\main\\labs\\laba8\\task2\\f.txt");
                    System.out.println(ReadWriteInt.Read("C:\\Users\\diman\\IdeaProjects\\ThirdYearJava\\src\\main\\java\\main\\labs\\laba8\\task2\\f.txt"));
                }
                case 3-> {
                    L8Task3.Calculate("C:\\Users\\diman\\IdeaProjects\\ThirdYearJava\\src\\main\\java\\main\\labs\\laba8\\task3");
                }
                case 4->{
                    L8Task4 t4=new L8Task4();
                    t4.DoIt();
                }
                case 5->{
                    Lab8Task5 task5=new Lab8Task5();
                    task5.DoIt();
                }
                default -> {flag=false; break; }
            }
        } while (flag);
    }

}
