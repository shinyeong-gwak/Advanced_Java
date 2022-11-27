package main.java.graphicEx;

import javax.swing.*;
import java.awt.*;

public class CardLayoutTest extends JFrame {

    public CardLayoutTest() {
        setTitle("카드 돌리기");
        JPanel p1 = new JPanel();
        JButton l2 = new JButton("<<");
        JButton l1 = new JButton("<");
        JButton r2 = new JButton(">>");
        JButton r1 = new JButton(">");
        p1.add(l2);
        p1.add(l1);
        p1.add(r1);
        p1.add(r2);
        add("North",p1);//다른 방법도 있음
        CardLayout card = new CardLayout();
        JPanel p2 = new JPanel(card);
        JButton[] b = new JButton[5]; // 링크 5개
        for (int i=0; i<5; i++) {
            b[i] = new JButton("카드번호" + (i+1));
            p2.add(b[i]);
        }
        add("Center",p2);

        l2.addActionListener(e -> card.first(p2));
        l1.addActionListener(e -> card.previous(p2));
        r2.addActionListener(e -> card.last(p2));
        r1.addActionListener(e -> card.next(p2));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//새로운 스레드 그래픽 받아서 꺼라
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CardLayoutTest();
    }
}
