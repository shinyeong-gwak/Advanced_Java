package main.java.guiEx;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo extends JFrame {
    //가장 최근에 있는 것 만 보임 - 겹친 카드 처럼
    CardLayout layout;
    public void rocate() {
        while(true) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            layout.next(this.getContentPane());
        }
    }

    CardLayoutDemo() {
        setTitle("카드 레이아웃!");
        layout = new CardLayout(); //객체 초기화. 근데 필드는 자동 초기화 안되나.
        setLayout(layout);

        add("0", new JButton("버튼 0"));
        add("1", new JButton("버튼 1"));
        add("2", new JButton("버튼 2"));
        add("3", new JButton("버튼 3"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,110);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo().rocate();
    }
}
