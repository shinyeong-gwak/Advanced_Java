package graphicEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class ColorFontDemo extends JFrame {
    public ColorFontDemo() throws HeadlessException {
        setLayout(new BorderLayout(20,20));
        setTitle("색상 변환하기");
        JButton b = new JButton("색상 변환");

        add(b);
        MouseAdapter ma = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int[] r = new Random().ints(3,0,256).toArray();
                Color c = new Color(r[0],r[1],r[2]);
                b.setBackground(c);
                b.setFont(new Font("TimeisRoman",Font.BOLD,10)); // 여기!!! 순서는 폰트 이름, 특성, 사이즈

            }
        } ;
        b.addMouseListener(ma);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new StarDemo();
    }
}
