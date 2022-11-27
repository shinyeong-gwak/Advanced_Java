package main.java.threadEx;

import java.util.Random;

public class AccumTest {
    public static void main(String[] args) {
        Accumulator a1 = new Accumulator(3); // 여기서 3개를 생성함
        Accumulator a2 = new Accumulator(2); // 여기서 2개를 생성함 합한 값을 메인메서드에서 출력
        a1.start();
        a2.start();
        try {
            a1.join(); a2.join(); // a1이랑 a2 끝날때까지 메인메소드 기다리란 말
        } catch (InterruptedException e) {
        }
        System.out.println("누적 값 = " + (a1.getSum()+a2.getSum()));
    }
}

class Accumulator extends Thread { //임의의 정수 매개변수
    private int repeat;
    private long sum; //멤버 변수는 초기값이 있음 초기화 맘대로

    public Accumulator(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public void run() {
        long num =0;
        Random r = new Random();
        for (int i = 0; i < repeat; i++){
            num = r.nextInt();
            System.out.println(getName()+": "+num);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
    }//여기 좃됨

    public long getSum() {
        return sum;
    }
}