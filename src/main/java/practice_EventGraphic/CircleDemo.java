package practice_EventGraphic;

import javax.swing.*;
import java.awt.*;

public class CircleDemo extends JFrame {
    public CircleDemo() throws HeadlessException {
        setTitle("원 돌리기");

        class MyPanel extends JPanel {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.fillArc(50,50,100,100,100,30);
                g.fillArc(50,50,100,100,220,30);
                g.fillArc(50,50,100,100,340,30);
            }
        }

        add(new MyPanel());

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);


    }

    public static void main(String[] args) {
        new CircleDemo();
    }
}
