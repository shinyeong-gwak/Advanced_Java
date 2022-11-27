package main.java.threadEx;

class TotalThread extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this) { //객체 전체에 대한 공간
            for (int i = 1; i<=100; i++)
                total += i;
            notify();
        }// 동기화 연결 코드

    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        TotalThread t = new TotalThread();
        t.start();
        synchronized (t) {
            try {
                System.out. println("스레드 t가 끝날 때까지 대기...");
                t.wait(); // notify 신호를 받아야 넘어감 -> 프로듀서콘슈머 프라블럼
            } catch (InterruptedException e) {
            }
        }
        System.out.println("종합 : "+t.total);
    }
}
