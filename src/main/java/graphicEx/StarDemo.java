package graphicEx;

import javax.swing.*;
import java.awt.*;

public class StarDemo extends JFrame {
    int[] x = { 82, 92, 112, 92, 100, 80, 55, 68, 49, 72, 82 };
    int y[] = { 8, 32, 38, 50, 75, 55, 72, 45, 28, 30, 8 };
    class MyPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //클래스 생성과 동시에 이거 바로 실행하겠다는 뜻

            g.setColor(Color.RED);
            g.fillPolygon(x,y,10);

            g.setColor(Color.RED);
            g.fillArc(150,10,30,30,90,90);

            g.setColor(Color.BLUE);
            g.fillArc(155,10,30,30,0,90);

            g.setColor(Color.YELLOW);
            g.fillArc(150,15,30,30,180,90);

            g.setColor(Color.GREEN);
            g.fillArc(155,15,30,30,270,90);


        }
    }

    public StarDemo() throws HeadlessException {
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
