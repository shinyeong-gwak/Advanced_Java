package main.java.practice_thread;

public class prac08 extends Thread {
    public static void main(String[] args) {
        Thread music = new Thread(() -> {
            System.out.println("g");
        });
        music.setDaemon(true);
        music.start();

        System.out.println("아 메인스레드인가~~");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }
}
