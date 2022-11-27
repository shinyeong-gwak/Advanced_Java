package main.java.practice_thread;

public class prac09 implements Runnable{ //class는 기본적으로 하나의 스레드인거고 생성과 동시에 실행, main 에서는 클래스 호출하지 않은 이상 없는걸로 Runnable안됨
    public static void main(String[] args) {
        Thread thread = new Thread(()-> System.out.println("안녕"));
        new prac09().run();
        thread.start();

    }

    @Override
    public void run() {
        System.out.println("안녕하세요");
    }
}
