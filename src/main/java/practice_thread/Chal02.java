package main.java.practice_thread;

public class Chal02 {
    public static void main(String[] args) {
        Thread worker = new Thread(()->{
            for(int i = 0 ; i<5; i++) {
                System.out.println("작업스레드 : " +i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });

        worker.start();
        int c = 'a';
        while(worker.isAlive()) {
            System.out.println("메인 스레드 : "+(char) c);
            c++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
