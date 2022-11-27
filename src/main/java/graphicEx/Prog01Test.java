package graphicEx;

import javax.swing.*;
import java.awt.*;

public class Prog01Test extends JFrame {
    public Prog01Test(){
        setTitle("배경색 바꾸기");
        JButton b = new JButton("클릭");
        JPanel p = new JPanel();
        p.add(b);//팬널 굳이 필요 없을 수도
        add(p);

        b.addActionListener(e -> {
            if (p.getBackground() == Color.YELLOW)
                p.setBackground(null);
            else
                p.setBackground(Color.YELLOW);
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//새로운 스레드 그래픽 받아서 꺼라
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Prog01Test();
    }
}

//4번 - 스레드까지 연계함 , 12번