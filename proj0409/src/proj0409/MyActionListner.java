package proj0409;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListner implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        if(b.getText().equals("Action!!!!!!!!")){
            b.setText("Action......");
            System.out.println("Action!!!!!!!!");
            System.out.println(e);
        }else{
            b.setText("Action!!!!!!!!");
            System.out.println("Action.......");
        }
    }
}

