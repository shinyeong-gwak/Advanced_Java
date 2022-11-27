package main.java.practice_thread;

public class Chal04 extends Thread{
    public Chal04() {
        Thread t = new Thread(this::run);
        t.start();
        int c = 'a';
        while(t.isAlive()) {
            System.out.println("메인 스레드 : "+(char) c);
            c++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
    public void run() {
        for(int i = 0 ; i<5; i++) {
            System.out.println("작업스레드 : " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new Chal04();
    }
}
