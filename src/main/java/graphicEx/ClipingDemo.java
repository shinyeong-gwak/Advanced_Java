package graphicEx;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClipingDemo extends JFrame {
    public ClipingDemo() throws HeadlessException {
        class MyPanel1 extends JPanel {
            BufferedImage img;

            public MyPanel1() {
                try {
                    img = ImageIO.read(new File("images\\balloons.png"));
                } catch (IOException e) {
                }
            }

            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setClip(30, 20, 240, 170);

                g.drawImage(img, 0, 0, null);

                g.setColor(Color.RED);

                g.drawRect(20, 10, 100, 100); //구역 밖의 도형은 잘림

            }
        }
    add(new MyPanel1());

    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(300,200);
    setVisible(true);
}

    public static void main(String[] args) {
        new ClipingDemo();
    }
}
