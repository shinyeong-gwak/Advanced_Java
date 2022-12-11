package practice_event;

import javax.swing.*;
import java.awt.*;

public class RandomEvent extends JFrame {
    protected RandomEvent() throws HeadlessException {
        setTitle("난수 생성기");

        class PaintCom extends JPanel{
            public void paintComponent(Graphics g) {
                super.paintComponents(g);

                for(int i = 0; i<100; i++) {
                    g.drawString(Character.toString((char) (Math.random() * 26 + 65)), (int) (Math.random() * 400), (int) (Math.random() * 300));
                }
            }
        }

        add(new PaintCom());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        new RandomEvent();
    }
}
