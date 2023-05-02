package main.labs.laba9;

import java.util.Scanner;

public class Lab9 {
    public Lab9(){
        boolean flag = true;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Введите номер задания");
            int num = in.nextInt();
            switch (num) {
                case 1-> {
                   task1();
                }
                case 2-> {
                    task2();
                }
                case 3-> {
                    task3();
                }

                default -> {flag=false; break; }
            }
        } while (flag);
    }
    void task1(){
        Thread thread = new Thread(() -> {
            try {
                System.out.println("Состояние потока до запуска: " + Thread.currentThread().getState());
                System.out.println("Запуск потока");
                Thread.sleep(200);
                System.out.println("Состояние потока во время выполнения: " + Thread.currentThread().getState());
            } catch (InterruptedException e) {
                System.out.println("Прерывание потока");
            }
        });
        System.out.println("Состояние потока до запуска: " + thread.getState());
        thread.start();
        System.out.println("Состояние потока после запуска: " + thread.getState());
    }
    synchronized void task2(){
            for(int i=0;i<20;i++) {
                Thread t1 = new Thread(() -> {
                     System.out.println("Поток 1");
                });
                t1.setName("Поток 1");

                Thread t2 = new Thread(() -> {
                    System.out.println("Поток 2");
                });
                t2.setName("Поток 2");

                t1.start();
                t2.start();
            }
    }
    void task3(){
        ProducerConsumer pc = new ProducerConsumer();
        Thread t1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    }
}
/*class MyThread extends Thread{
    public MyThread(String s){
        this.setName(s);
    }
    public String getMyThread(){
        return this.getName();
    }

}*/
