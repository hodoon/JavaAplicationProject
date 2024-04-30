package proj0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelEx01 extends JFrame {
    public JPanelEx01(){
        this.setTitle("JPanelEx01");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pn1 = new JPanel();
        JButton btn1 = new JButton("RED");
        pn1.add(btn1);

        JButton btn2 = new JButton("GREEN");
        pn1.add(btn2);
        JButton btn3 = new JButton("YELLOW");
        pn1.add(btn3);

        JLabel lbResult = new JLabel("Here is the result.");
        pn1.add(lbResult);

        this.add(pn1);

        btn1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent arg0) {
               pn1.setBackground(Color.RED);
               lbResult.setText("Push the red button!!");
           }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                pn1.setBackground(Color.GREEN);
                lbResult.setText("Push the green button!!");
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                pn1.setBackground(Color.YELLOW);
                lbResult.setText("Push the yellow button!!");
            }
        });

        this.setSize(350, 150);
        this.setVisible(true);

    }

}