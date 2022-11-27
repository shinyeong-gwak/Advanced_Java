package graphicEx;

import javax.swing.*;
import java.awt.*;

public class LineDemo extends JFrame {
    int[] x = {155,205,255};
    int[] y = {5,50,9};

    public LineDemo() throws HeadlessException {
        class MyPanel extends JPanel{
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); //클래스 생성과 동시에 이거 바로 실행하겠다는 뜻

                g.setColor(Color.RED);
                g.drawLine(50,10,150,50);
                g.setColor(Color.BLUE);
                g.drawPolyline(x,y,3); //굽은 라인
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
