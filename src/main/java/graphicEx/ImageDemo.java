package graphicEx;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDemo extends JFrame {
    public ImageDemo() throws HeadlessException {
        setTitle("이미지 그리기");

        class MyPanel extends JPanel {
            BufferedImage img;

            public MyPanel() {
                try {
                    img = ImageIO.read(new File("images\\balloons.png"));
                } catch (IOException e) {
                }
            }

            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(img,0,0,null);
            }
        }
        add(new MyPanel());

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageDemo();
    }
}
