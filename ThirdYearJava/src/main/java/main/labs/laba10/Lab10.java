package main.labs.laba10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class  Lab10{

    public Lab10(){
        List<Philosopher> philosophers = new ArrayList<>();
        Object[] forks = new Object[5];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        philosophers.add(new Philosopher("Первый", forks[0], forks[1]));
        philosophers.add(new Philosopher("Второй", forks[1],forks[2]));
        philosophers.add(new Philosopher("третий", forks[2], forks[3]));
        philosophers.add(new Philosopher("Четвертый", forks[3], forks[4]));
        philosophers.add(new Philosopher("Пятый", forks[4], forks[0]));

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (Philosopher p : philosophers) {
            executor.execute(p);
        }
        executor.shutdown();
    }
}
