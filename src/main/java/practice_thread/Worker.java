package main.java.practice_thread;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        Runnable r =() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            exec.shutdown();
        };
        int alphabet = 'a';
        exec.submit(r);
        while(!exec.isShutdown()) {
            System.out.println((char)alphabet++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
