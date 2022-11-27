package main.java.practice_thread;

import java.io.IOException;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.interrupted;

public class Ex02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runnable r = () -> {
            while(true) {
                System.out.println("작업 실행 중...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }

        };
        Thread t = new Thread(r);

        t.start();
        int i;
        while (true) {
            i = System.in.read()-48;
            if (i== 1) {
                System.out.println(i+"\n작업 완료.");
                t.interrupt();
                break;
            }

        }

    }
}
//break는 양쪽에 다 해주기
//인터럽트 발생 시키면 catch에서 받기
