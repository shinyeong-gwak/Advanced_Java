package eventEx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class MouseMotionAdapterDemo extends JFrame {
    public MouseMotionAdapterDemo() throws HeadlessException {
        setTitle("마우스 이동 어댑터");

        JLabel l = new JLabel("움직이는 레이블");
        l.setForeground(Color.RED);
        // bold 하는 코드
        add("Center",l);

        addMouseMotionListener(new MyMouseMotionAdapter(l));


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterDemo();
    }

    private class MyMouseMotionAdapter implements MouseMotionListener {
        JLabel l;
        public MyMouseMotionAdapter(JLabel l) {
            this.l = l;
        }
//계속 호출되는 함수, 왜 마우스랑 위치가 안맞을까? 이유 찾아보기!!
        @Override
        public void mouseDragged(MouseEvent e) {

            l.setForeground(Color.MAGENTA);
            l.setLocation(e.getX(),e.getY()-50);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            l.setForeground(Color.GREEN);
            l.setLocation(e.getX(),e.getY()-50);
        }
    }
}
