package main.java.guiEx;

import javax.swing.*;

public class SwingTest {
    public static void main(String[] args) {
        new MyFrame();
        JFrame f = new JFrame("난 ㅌ");
        //f.setTitle("난 타이틀");
        f.setSize(300,100);
        f.setVisible(true); // 이벤트 디스패치 스레드를 계속 실행함
        JPanel p = new JPanel();
        JLabel l = new JLabel("hello. swing!");
        JButton b = new JButton("벝");
        p.add(l);
        p.add(b);
        f.add(p);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //실행까지 아예 스레드를 없애버리는 용도 -> x누를 때!
    }
}

class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("난 타이틀");
        setSize(300,100);
        setVisible(true); // 이벤트 디스패치 스레드를 계속 실행함
    }
}
