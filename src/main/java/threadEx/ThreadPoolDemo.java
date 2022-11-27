package main.java.threadEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i =0; i<5; i++) {
                System.out.println("잘가. ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        };
        //계속 thread를 만들면 안됨 어짜피 다 사용 못함 오버헤드 때문에
        //ExecutorService exec = Excutors.newCashedThreadPool();
        ExecutorService exec = Executors.newFixedThreadPool(4); //위에랑 같은 뜻
        exec.submit(task);

        for (int i =0; i<5; i++) {
            System.out.println("잘가. ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        exec.shutdown();
    }
}
