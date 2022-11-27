package main.java.practice_thread;

import java.util.Random;

public class Ex03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Worker_1(3);
        t1.start();
        Thread t2 = new Worker_1(2);
        t2.start();
        t1.join(); t2.join();
        System.out.println("누적 값 : "+Worker_1.sum);

    }
}

class Worker_1 extends Thread {
    public static int sum;
    public Worker_1(int num) {
        int variable;
        for(int i =0; i<num; i++) {
            Random r = new Random();
            variable = r.nextInt(10);
            this.sum += variable;
            System.out.println(currentThread()+" : " + variable);
        }


    }
}