package proj0409;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex02 extends JFrame {
    public Ex02() {
        setTitle("Ex Event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton("Action");
        b1.addActionListener(new MyAction2());
        c.add(b1);

        setSize(350, 150);
        setVisible(true);
    }

    class MyAction2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action")){
                b.setText("Korean Action");
            } else {
                b.setText("Action");
            }
        }
    }
}
