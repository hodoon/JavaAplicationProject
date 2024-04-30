package proj0409;

import javax.swing.*;
import java.awt.*;

public class IndepClassListner extends JFrame {
    public IndepClassListner() {
        setTitle("Ex Event Listener");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton("Action");
        b1.addActionListener(new MyActionListner());
        c.add(b1);

        setSize(350, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new IndepClassListner();
    }
}
