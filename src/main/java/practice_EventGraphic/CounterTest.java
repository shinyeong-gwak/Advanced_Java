package practice_EventGraphic;

import javax.swing.*;
import java.awt.*;

public class CounterTest extends JFrame {
    public CounterTest() throws HeadlessException {
        setTitle("카운터");

        JButton b = new JButton("시작");
        JLabel l = new JLabel("카운터 : ");
        b.addActionListener(e -> {
            if((JButton) e.getSource() == b) {
                for (int i = 0; true;i++) {
                    try {
                        Thread.sleep(500);
                        l.setText("카운터 : "+ i);
                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        add("Center",b);
        add("South",l);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterTest1();
    }
}
