package eventEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.EventListener;
import java.util.List;

public class notEventDemo extends JFrame {
    JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
    JPanel p1 = new JPanel(new GridLayout(2,2));
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
    JLabel l1 = new JLabel("원의 반지름");
    JTextField t1 = new JTextField(10);
    JLabel l2 = new JLabel("원의 넓이");
    JTextField t2 = new JTextField(10);
    JTextArea ta = new JTextArea(8,20);
    public notEventDemo() {
        setLayout(new BorderLayout());

        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    void showNorth() {
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        panel.add(p1);
        add(panel,BorderLayout.NORTH);
    }

    void showCenter() {
        p2.add(ta);
        add(p2,BorderLayout.CENTER);
    }

    void showSouth() {
        JButton b1 = new JButton("계산");
        String[] colors = {"RED","blue","BLACK"};
        JComboBox<String> c1 = new JComboBox<>(colors);
        JButton b2 = new JButton("리셋");
        p3.add(b1);
        p3.add(c1);
        p3.add(b2);
        add(p3,BorderLayout.SOUTH);

        ActionListener al1 = e -> {
            if (e.getSource() == b1) {
                if (t1.getText().isEmpty())
                    ta.setText("반지름 입력 요청");
                else {
                    double radius = Double.parseDouble(t1.getText());
                    double area = radius * radius * 3.14;
                    t2.setText(Double.toString(area));
                    ta.setText(String.format("%.2f * %.2f * 3.14 = %.2f", radius, radius, area));
                }
            }else {
                t1.setText("");
                t2.setText("");
                ta.setText("");
            }
        };
        b1.addActionListener(al1);
        b2.addActionListener(al1);

        c1.addActionListener(e -> {
            int selected = ((JComboBox) c1).getSelectedIndex();
            switch (selected) {
                case 0 -> ta.setForeground(Color.red);
                case 1 -> ta.setForeground(Color.blue);
                case 2 -> ta.setForeground(Color.black);
            }
        });
    }

    public static void main(String[] args) {
        new notEventDemo();
    }
}
