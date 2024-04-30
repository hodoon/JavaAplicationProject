package proj0409;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 extends JFrame {
    Ex03() {
        this.setTitle("Anonymous Class Listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        JButton btn1 = new JButton("Red");
        cp.add(btn1);
        JButton btn2 = new JButton("Green");
        cp.add(btn2);
        JButton btn3 = new JButton("Blue");
        cp.add(btn3);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setBackground(Color.RED);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn2.setText("Korean Green");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cp.setBackground(Color.BLUE);
            }
        });


        this.setSize(350, 150);
        this.setVisible(true);
    }
}
