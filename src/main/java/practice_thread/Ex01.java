package main.java.practice_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex01 implements Runnable {
    public static void main(String[] args) {
        new Ex01().run();
        ExecutorService thread = Executors.newCachedThreadPool();
        thread.submit(new Ex01());
        thread.shutdown();
    }

    @Override
    public void run() {
        try {
            System.out.println("나 실행됐어~~");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
