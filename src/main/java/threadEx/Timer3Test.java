package main.java.threadEx;

public class Timer3Test {
    public static void main(String[] args) {
        new Thread(new MyTask()).start();
    }
}

class MyTask implements Runnable { // alt + Insert 누르면 구현 메소드 바로 폼 나옴
    @Override
    public void run() {
        for (int i = 0; ; ) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }//ctrl + alt + L 괄호 정리해줌
        }
    }
}