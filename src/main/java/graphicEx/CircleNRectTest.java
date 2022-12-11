package graphicEx;

import javax.swing.*;
import java.awt.*;

public class CircleNRectTest extends JFrame {
    int[] x = {155,205,255};
    int[] y = {5,50,9};
// 클릭하는 위치 좌표 뽑아내는거 하나 작성하자.
    public CircleNRectTest() throws HeadlessException {
        setTitle("다양한 사각형 그리기");
        class MyPanel extends JPanel{
            protected void paintComponent(Graphics g) {
                super.paintComponent(g); //클래스 생성과 동시에 이거 바로 실행하겠다는 뜻

                g.setColor(Color.RED);
                g.drawRect(10,5,50,50); //좌상단 좌표, 크기
                g.drawRoundRect(70,5,50,50,10,10);
                g.drawRect(140,5,50,50);
                g.drawRoundRect(210,5,50,50,10,10);
                g.drawOval(10, 130,50,50);

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

//5번은 의미 없고 6, 졸라 7번!!! 5개 호 돌아감 팔랑개비!!!!
    public static void main(String[] args) {
        new CircleNRectTest();
    }
}
