package practice_EventGraphic;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterTest1 extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JButton b1, b2;
    Thread t;

    CounterTest1() {
        setTitle("ī����");

        JPanel p1 = new JPanel();
        label = new JLabel("���� = 0");
        p1.add(label);
        add("Center", p1);

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        b1 = new JButton("����");
        b2 = new JButton("����");

        b1.addActionListener(this);
        b2.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        add("South", p2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);

        t = new Thread(new Counter());
        t.setDaemon(true);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((JButton) e.getSource() == b1) {
            if (t.isAlive()) {
                b1.setText("����");
                t.interrupt();
            } else {
                b1.setText("����");
                t = new Thread(new Counter());
                t.setDaemon(true);
                t.start();
            }
        } else {
            count = 0;
            label.setText("���� = 0");
            b1.setText("����");
            t.interrupt();
        }

    }

    public static void main(String[] args) {
        new CounterTest1();
    }

    class Counter implements Runnable {
        public void run() {
            while (true) {
                count++;
                label.setText("���� = " + count);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    return;
                }
            }
        }
    }
}