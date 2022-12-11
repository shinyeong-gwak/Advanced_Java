package practice_EventGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickCircleDemo extends JFrame {
    JPanel p1, p2;
    Color[] colors = {Color.RED,Color.PINK,Color.ORANGE,Color.CYAN};
    MouseAdapter m;
    public ClickCircleDemo() throws HeadlessException {
        setTitle("원 돌리기");
        new FlowLayout();
        p1 = new JPanel();
        p2 = new JPanel(new BorderLayout());

        JButton b = new JButton("클릭");

        class MyPanel extends JPanel {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                for(int j = 0 ; j<36; j++) {
                    try {
                        Thread.sleep(500);
                        g.fillArc(50,50,100,100,0,10*j);
                    } catch (InterruptedException e) {
                    }
                }

                m = new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int i = 0;
                        if((JButton) e.getSource() == b) {
                            g.setColor(colors[(i++%4)]);

                        }

                    }
                };
                b.addMouseListener(m);
            }
        }
        p2 = new JPanel();
        p2.add(b);
        add(new MyPanel(),BorderLayout.CENTER);
        add(p2,BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new ClickCircleDemo();
    }
}
