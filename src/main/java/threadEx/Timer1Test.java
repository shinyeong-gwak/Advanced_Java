package main.java.threadEx;


public class Timer1Test implements Runnable { //runnable 인터페이스 구현 : 런이 수행할 작업을 정의
    public static void main(String[] args) {
        Runnable rambda = () -> {
            System.out.println();
        };
    }

    @Override
    public void run() { // 함수형 인터페이스는 람다식으로 가능
        for(int i =0; ;) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { // ctrl + alt + T - 6 바로 트라이캐치 넣기
            }
        }
    }
}
