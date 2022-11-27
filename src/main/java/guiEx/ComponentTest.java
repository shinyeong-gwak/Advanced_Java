package main.java.guiEx;

import javax.swing.*;
import java.awt.*;

public class ComponentTest extends JFrame {
    public ComponentTest() {
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10,10));
        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,305);
        setVisible(true);
    }

    void showSouth() {
        String[] colors = {"red","blue"};
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(colors);
        JButton rst = new JButton("리셋");

        panel.add(cal);
        panel.add(cb);
        panel.add(rst);

        add(panel, BorderLayout.SOUTH);
    }

    void showCenter() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JTextArea area= new JTextArea(30,20);
        area.setText("이 영역에 원의 넓이\n계산하는 ...");
        area.setEditable(false);
        area.setForeground(Color.RED);

        panel.add(area);
        add(panel, BorderLayout.CENTER);
    }

    void showNorth() {
        JPanel panel = new JPanel(new GridLayout(2,2));

        JLabel l1 = new JLabel("원의 반지름");
        l1.setHorizontalAlignment(SwingConstants.CENTER);//????
        JTextField t1 = new JTextField(10);
        JLabel l2 = new JLabel("원의 넓이");
        l2.setHorizontalAlignment(SwingConstants.CENTER);//????
        JTextField t2 = new JTextField(10);
        t2.setEditable(false);

        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);

        add(panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        new ComponentTest();
    }
}
