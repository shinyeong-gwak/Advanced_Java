package eventEx;

import javax.swing.*;
import java.awt.event.AdjustmentListener;

public class AdjustmentListenerDemo extends JFrame {
    public AdjustmentListenerDemo() {
        JScrollBar jbar = new JScrollBar(JScrollBar.HORIZONTAL);
        jbar.setValues(50,10,0,100);
        JLabel l1 = new JLabel("",JLabel.CENTER);
        jbar.addAdjustmentListener(e -> {
            if(jbar.getValueIsAdjusting())
                l1.setText("스크롤 : "+Integer.toString(jbar.getValue()));
        });
        add("North",jbar);
        add("South",l1);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdjustmentListenerDemo();
    }
}
