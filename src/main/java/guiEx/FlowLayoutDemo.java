package main.java.guiEx;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    FlowLayoutDemo() {
        setTitle("플로우 레이아웃");

        JPanel p = new JPanel(new FlowLayout());
        p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); // 방향 설정 오-왼으로 가게 해라

        JButton b1 = new JButton("B 1");
        JButton b2 = new JButton("버튼 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button Four");
        p.add(b4);
        p.add(b1);
        p.add(b2);
        p.add(b3);

        add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,110);
        setVisible(true);
    }

    public static void main(String[] args) {
        //Flow 레이아웃 : 프레임에 픽셀 간격 관련 컨테이너 / 글자처럼 취급
        //batch 레이아웃 : html같음
        new FlowLayoutDemo();


    }
}
