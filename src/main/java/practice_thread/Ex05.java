package main.java.practice_thread;

public class Ex05 {
}

class PrinterTest implements Runnable{

    public static void main(String[] args) {
        new Thread(new PrinterTest()).start();
        new Thread(new PrinterTest()).start();

    }

    @Override
    public void run() {
        synchronized (spliter()){};
        for(String s :spliter()) {
            try {
                Thread.sleep(0);
                System.out.printf("%s : %s\n",Thread.currentThread().getName(),s);
            } catch (InterruptedException e) {
            }
        }
    }

    public static String[] spliter() {
        String oneLine = "Time is money";
        return oneLine.split(" ");
    }
}
