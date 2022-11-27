package main.java.practice_thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Chal03{
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(); // or newFixed...
        Runnable r = () -> {
            for(int i = 0 ; i<5; i++) {
                System.out.println("작업스레드 : " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            exec.shutdown();
        };
        exec.submit(r);
        int c = 'a';
        while(!exec.isShutdown()) {
            System.out.println("메인 스레드 : "+(char) c);
            c++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }

    }

}
