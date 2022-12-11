package main.java.graphicEx;

import javax.swing.*;
import java.awt.*;

public class WatchDemo extends JFrame {
    public WatchDemo() throws HeadlessException {
        setTitle("진짜 시계");

        String time = "22:34:26";

        JPanel p = new JPanel();
        JLabel l = new JLabel(time,JLabel.CENTER);
        p.add(l);
        add("Center",p);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WatchDemo();
    }
}
