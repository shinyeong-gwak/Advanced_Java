package Quiz;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Quiz04 extends JFrame {
    private JButton b1;
    Thread thread;
    JPanel p1, p2;
    JPanel[] panels = new JPanel[7];
    Color indigo = new Color(75, 0, 130);   // 남색
    Color purple = new Color(128, 0, 128);  // 보라색
    Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
            Color.BLUE, indigo, purple};
    int cnt = 0;

    public Quiz04() {
        p1 = new JPanel(new GridLayout(0,7));
        p2 = new JPanel(new FlowLayout());
        thread = new Thread(new Counter());

        for(int i =0; i<7; i++){
            panels[i] = new JPanel();
            //panels[i].setBackground(colors[i]);
            p1.add(panels[i]);
        }
        add("Center",p1);
        add("South",p2);
            // 무지개 색상을 포함하는 7개의 작은 패널(panels)을
            // 큰 패널인 p1에 추가하는 코드
        JButton b = new JButton("시작");
        p2.add(b);
        b.addActionListener(e ->{

            if(thread == null || !thread.isAlive() ) {
                thread = new Thread(new Counter());
                thread.setDaemon(true);         ///???? 찾아보기
                b.setText("중지");
                thread.start();
            }
            else {
                b.setText("계속");
                thread.interrupt();

            }

//            if(e.getSource() == b){
//                if(b.getText() == "시작"){
//                    thread.start();
//                    b.setText("중지");
//                }
//                else if(b.getText()=="중지"){
//                    thread.interrupt();
//                    b.setText("계속");
//                }
//                else if(b.getText()=="계속"){
//                    thread.start();
//                    b.setText("중지");
//                }
//            }
        });

            // 버튼을 클릭하면 다음과 같은 이벤트를 처리하는 코드 추가
            // 스레드를 이용하여 이벤트를 처리
            // 버튼 이름은 최초에는 '시작'ㅇ
            // '시작' 버튼을 클릭하면 '중지'로 변경되면서ㅇ
            // 7개의 작은 패널에 차례대로 무지개 색상이 나타난다.
            // '중지' 버튼을 클릭하면 버튼 이름이 '계속'으로 변경되면서ㅇ
            // 계속해서 7개의 작은 패널에 차례대로 무지개 색상이 나타난다.


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);

    }


    class Counter implements Runnable {
        @Override
        public void run() {
            try {
                do {
                    panels[cnt].setBackground(colors[cnt]);
                    Thread.sleep(500);
                    cnt++;
                    panels[cnt].setBackground(Color.WHITE);
                } while(!thread.isInterrupted());
            } catch (InterruptedException e) {
                System.out.println("중지");
                thread = new Thread(new Counter());
                //return;
            }
        }
        // 버튼을 클릭할 때 스레드가 할 일을 추가
		// 스레드가 할 일은 0.5초 마다 무지개 색상을
		// 7개의 작은 패널에 나타낸다
        // 입출력, 데베 프로그래밍 xxx 스레드/gui 위주로 나옴, gui 기초에선 잘 안나옴
    }

    public static void main(String args[]) {
        new Quiz04();

    }
}