package main.java.Quiz;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// 도움이 되는 예제 : 교재 예제 15-9
public class Quiz03 extends JFrame {
    JButton[] btns = { new JButton("빨강"), new JButton("초록"), new JButton("파랑") };
    Color[] colors = { Color.RED, Color.GREEN, Color.BLUE };

    public Quiz03() {
        // 필요한 코드 추가
        setLayout(new GridLayout(0,3));
        for(int i = 0; i<3; i++)
            add(btns[i]);


        choColored();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    void choColored() {
        int RandNum = new Random().nextInt(3);
        System.out.println(RandNum);
        btns[RandNum].setBackground(colors[RandNum]);
    }

    public void exec() {
        while(true) {
            for(int i = 0 ; i<3; i++)
                btns[i].setBackground(Color.WHITE);
            int j = (int) (Math.random()*3);
            btns[j].setBackground(colors[j]);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

        }
    }
//펑션 콜은 자발적으로 넘겨주는 것 인터럽트는 따로 돌아가야함
    // 프로시저는 내가 조절 가능?
    // 필요하다면 메서드 추가

    public static void main(String[] args) {
        // 필요한 코드 추가
        while(true) {
            try {
                JFrame f = new Quiz03();
                Thread.sleep(500);
                f.dispose();
            } catch (InterruptedException e) {
            }
        }
    }
}
