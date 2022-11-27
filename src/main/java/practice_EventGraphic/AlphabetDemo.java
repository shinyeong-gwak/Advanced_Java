package practice_EventGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//mouseListener : 구현 메소드가 많음, 판넬 등등 이벤트를 모을 수 없는 객체에서 사용
//mouseAdapter : 구현 어떤거 할건지 잡아주는 애 함수형으로 받아서 Listener 객체 안으로 들어감
//ActionListener : 함수형 Inter => Button같이 위치 잡아주는 애는 액션을 바로 받아서 안에 객체로 뭐 할건지 함수만 입력해주면 됨

public class AlphabetDemo extends JFrame {
    Random r = new Random();
    List<Character> list = new ArrayList<>();
    MouseEvent e;
    public AlphabetDemo() throws HeadlessException {
        setTitle("랜덤 사각형");
        AlphabetDemo.MousePanel p =new AlphabetDemo.MousePanel();
        add( p);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    class MousePanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    if (AlphabetDemo.this.e != null) {
                        if (AlphabetDemo.this.e.equals(e))
                            return;
                    }

                    char c = (char)(r.nextInt(65, 91));
                    int x = r.nextInt(350);
                    int y = r.nextInt(150);
//                    list.add()


                    AlphabetDemo.this.e = e;
                }
            });

            for (int i = 0; i < list.size(); i++) {
                Character r = list.get(i);
//                int x = (int) r.getX();
//                int y = (int) r.getY();
//                int l = (int) r.getWidth();
//                g.drawRect(x, y, l, l);
            }
        }
    }

    public static void main(String[] argv) {
        new graphicEx.RepaintDemo();
    }
}
