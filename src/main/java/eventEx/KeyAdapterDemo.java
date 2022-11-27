package eventEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapterDemo extends JFrame {
    public KeyAdapterDemo() throws HeadlessException {
        setTitle("키 어댑터");

        JLabel l = new JLabel("",JLabel.CENTER);
        JTextField t = new JTextField(10);

        add("North", t);
        add("Center", l);

        t.addKeyListener(new KeyAdapter() { //t에 대한 값을 하나하나 집중한다
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) { //엔터를 치는 이벤트가 발생했을 때
                    l.setText("입력한 문자열 : "+ t.getText()); //t에 있던 문자열을 가져온다.
                }
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyAdapterDemo();
    }
}
