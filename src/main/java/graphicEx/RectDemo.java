package graphicEx;

import javax.swing.*;
import java.awt.*;

public class RectDemo extends JFrame {
    int[] x = {155,205,255};
    int[] y = {5,50,9};

    public RectDemo() throws HeadlessException {
        setTitle("다양한 사각형 그리기");
        class MyPanel extends JPanel{
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); //클래스 생성과 동시에 이거 바로 실행하겠다는 뜻

                g.setColor(Color.RED);
                g.drawRect(10,5,50,50);
                g.drawRoundRect(70,5,50,50,10,10);
                g.drawRect(140,5,50,50);
                g.drawRoundRect(210,5,50,50,10,10);

                g.setColor(new Color(20, 135, 20));
                g.fillRect(10,65,50,50);
                g.fillRoundRect(70,65,50,50,10,10);
                g.fill3DRect(140,65,50,50,false);
                g.fill3DRect(210,65,50,50,true);
            }
        }
        add(new MyPanel());

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }


    public static void main(String[] args) {
        new RectDemo();
    }
}
