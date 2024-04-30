package proj0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameEx extends JFrame {
    private int rNumber;
    public GameEx(){
        this.setTitle("Random Number");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pn1 = new JPanel();

        JLabel l1 = new JLabel("숫자를 추측하시오 : ");
        pn1.add(l1);
        JTextField tf1 = new JTextField(10);
        pn1.add(tf1);

        JPanel pn2 = new JPanel();
        JLabel l2 = new JLabel("Input a random number.(1~100)");
        pn2.add(l2);

        JPanel pn3 = new JPanel();
        JButton b1 = new JButton("Confirm");
        pn3.add(b1);
        JButton b2 = new JButton("Exit");
        pn3.add(b2);

        JPanel mainPn = new JPanel();
        mainPn.add(pn1);
        mainPn.add(pn2);
        mainPn.add(pn3);

        this.add(mainPn);

        this.setRandomNum();
        this.setSize(300, 200);
        this.setVisible(true);

        System.out.println(rNumber);

        b1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = tf1.getText();
                int intIn = Integer.parseInt(input);
                if(intIn > rNumber){
                    l2.setText("Bigger numbers");
                    mainPn.setBackground(Color.RED);
                    b1.setText("Try Again");
                    tf1.setText("");
                } else if(intIn < rNumber){
                    l2.setText("Smaller numbers");
                    mainPn.setBackground(Color.RED);
                    b1.setText("Try Again");
                    tf1.setText("");
                } else {
                    l2.setText("Equal numbers");
                    setRandomNum();
                    tf1.setText("");
                    System.out.println(rNumber);
                    mainPn.setBackground(Color.BLUE);

                }
            }
        });

        b2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setRandomNum();
                l2.setText("Input a random number.(1~100)");
                tf1.setText("");
                b1.setText("Confirm");
            }
        });

    }
    public void setRandomNum(){
        rNumber = (int)(Math.random() * 100) + 1;
    }
}
