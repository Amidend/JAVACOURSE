package main.labs;

import main.labs.laba10.Lab10;
import main.labs.laba11.Lab11;
import main.labs.laba15.Lab15;
import main.labs.laba5.Lab5;
import main.labs.laba6.Lab6;
import main.labs.laba7.Lab7;
import main.labs.laba8.Lab8;
import main.labs.laba9.Lab9;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("ВВедите номер лабы");
            int num = in.nextInt();
            switch (num) {
                case 5 -> {
                    Lab5 lab5 = new Lab5();
                }
                case 6 -> {
                    Lab6 lab6 = new Lab6();
                }
                case 7->{
                    Lab7 lab7=new Lab7();
                }
                case 8->{
                    Lab8 lab8=new Lab8();
                }
                case 9->{
                    Lab9 lab9=new Lab9();
                }
                case 10->{
                    Lab10 lab10=new Lab10();
                }
                case 11->{
                    Lab11 lab11 =new Lab11();
                }
                case 15->{
                    Lab15 lab15= new Lab15();
                }
                default -> flag = false;
            }
        } while (flag);
    }
}