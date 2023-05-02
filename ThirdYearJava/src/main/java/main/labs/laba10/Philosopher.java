package main.labs.laba10;

import java.util.Random;

class Philosopher implements Runnable {
    private final String name;
    private final Object leftFork;
    private final Object rightFork;
    private final Random random;

    private int count=0;
    public Philosopher(String name, Object leftFork, Object rightFork) {
        this.name = name;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.random = new Random();
    }
    private void think() throws InterruptedException {
        System.out.println(name + " Думает");
        Thread.sleep(random.nextInt(1000));
    }

    private void eat() throws InterruptedException {
        count++;
        System.out.println(name + " Ест "+count);
        Thread.sleep(random.nextInt(1000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();
                synchronized (leftFork) {
                    System.out.println(name + " Взял левую вилку ");
                    synchronized (rightFork) {
                        System.out.println(name + " Взял правую вилку ");
                        eat();
                        System.out.println(name + " положил правую вилку ");
                    }
                    System.out.println(name + " положил левую вилку");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
    }
}