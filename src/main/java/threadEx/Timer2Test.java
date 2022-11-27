package main.java.threadEx;

public class Timer2Test {
//    public static void main(String[] args) {
//        new Thread(new Timer1Test()).start();
//    }
    public static void main(String[] args) {
        new Thread(new Runnable() {
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
        }).start();
    }
}
