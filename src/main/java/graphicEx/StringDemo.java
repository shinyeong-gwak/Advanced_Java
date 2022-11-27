package graphicEx;

import javax.swing.*;
import java.awt.*;

public class StringDemo extends JFrame {
    class MyPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //클래스 생성과 동시에 이거 바로 실행하겠다는 뜻

            g.drawString("문자열을 그려 보자!",20,20);
            g.drawString("너만 그리니? 나도 그려보자!",50,50);
        }
    }

    public StringDemo() throws HeadlessException {
        setTitle("문자열 그리기");

        add(new MyPanel());

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new StarDemo();
    }
}
