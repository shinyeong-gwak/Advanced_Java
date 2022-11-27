package main.java.practice_thread;

class LineThread extends Thread {
    String line;
    public LineThread(int tNum, String line) {
        setName("속담"+tNum);
        this.line = line;
    }

    @Override
    public void run() {
        synchronized (this) {
            cutter();
        }
        notify();
    }

    public synchronized void cutter() {
        for (String s : line.split(" "))
            try {
                Thread.sleep(1000);
                System.out.printf("%s : %s\n", this.getName(), s);
            } catch (InterruptedException e) {
            }
    }
}

//스레드가 공유하는 자원 = run메소드?

public class Ex06 {
    public static void main(String[] args) throws InterruptedException {
        LineThread t1 = new LineThread(1,"Time is money");
        LineThread t2 = new LineThread(2,"Time is money");
        t1.start();
        t2.start();

    }
}