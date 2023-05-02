package main.labs.laba9;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();

    public void produce() throws InterruptedException {
        int value = 0;
        for (int i = 0; i<100; i++){
            synchronized (this) {
                while (queue.size() >= 10) {
                    wait();
                }
                System.out.println("+Произвел " + value);
                queue.offer(value++);
                notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        for (int i = 0; i<100; i++){
            synchronized(this) {
                while (queue.isEmpty()) {
                    wait();
                }
                int value = queue.poll();
                System.out.println("-Потребил " + value);
                notify();
            }
        }
    }
}
