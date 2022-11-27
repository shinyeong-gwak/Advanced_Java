package main.java.threadEx;

public class Timer4Test {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; ; ) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }//ctrl + alt + L 괄호 정리해줌
            }
        };
        new Thread(r).start(); // 다 똑같은데 어디선가 runnable 구현한 거를 어떤 형태든 만들어놓고 스레드를 만들어서 그 안에 넣어 줘야 함!!
        //여러 방식으로 표현하는 방법을 다 알고 있어야 함.
    }
}
