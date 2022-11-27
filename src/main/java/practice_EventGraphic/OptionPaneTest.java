package practice_EventGraphic;

import javax.swing.*;
import java.awt.*;

public class OptionPaneTest extends JFrame {
    public OptionPaneTest() throws HeadlessException {
        setTitle("옵션판");
        new GridLayout(0,2,10,10);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        JOptionPane op = new JOptionPane("입력",JOptionPane.QUESTION_MESSAGE);
        p1.add(op);

        JLabel l = new JLabel("첫 번째 숫자는?",JLabel.LEFT);
        JTextField t = new JTextField(10    );
        JPanel p3 = new JPanel(new FlowLayout());
        JButton b1 = new JButton("확인");
        JButton b2 = new JButton("취소");

        p1.add(op);

        p3.add(b1);
        p3.add(b2);
        p2.add(l);
        p2.add(t);
        p2.add(p3);

        add(p1); add(p2);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        int[] tmp = new int[3];
        JLabel l =new JLabel("");
        String input = null;
        for (int i = 0; i < 3; i++) {
            if (i==0)
                input = JOptionPane.showInputDialog("첫 번째 숫자는?");
            else if(i ==1)
                input = JOptionPane.showInputDialog("두 번째 숫자는?");
            else
                JOptionPane.showConfirmDialog(null,String.format("합 = %d",tmp[0]+tmp[1]),"메시지",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);

            if(input.isEmpty()) {
                break;
            }
            tmp[i] = Integer.parseInt(input);
        }


    }

}