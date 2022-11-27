package main.java.practice_thread;

public class Ex04 {
    public static void main(String[] args) {
        Echoer e1 = new Echoer("환영"); //스레드 1 생성
        Echoer e2 = new Echoer("야호"); //스레드 2 생성
        Echoer e3 = new Echoer("자바"); //스레드 3 생성
        e1.start();
        e2.start();
        e3.start();
//??????????????????????????????????????????????????
    }
}

class Echoer extends Thread {
    String msg;
    static Echo echo= new Echo();

    public Echoer(String msg) {
        this.msg = msg;
    }
    @Override
    public void run() {
        echo.echo(msg);
    }
}
class Echo {

    public synchronized void echo(String message) { //syn 있고 없고 차이
        try {
            for(int i = 0 ; i<3 ; i++) {
                System.out.println(message);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}