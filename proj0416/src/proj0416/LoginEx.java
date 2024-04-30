package proj0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginEx extends JFrame {
    public LoginEx() {
        this.setTitle("Login From");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(3, 2);
        grid.setVgap(2);
//----------------------------------------------------------------
        Container c = getContentPane();
        c.setLayout(grid);

        c.add(new JLabel("E-Mail"));
        JTextField eMailField = new JTextField(10);
        c.add(eMailField);

        c.add(new JLabel("Password"));
        JTextField passwordField = new JTextField(10);
        c.add(passwordField);

        JButton loginBtn = new JButton("Login");
        c.add(loginBtn);

        JButton cancelBtn = new JButton("Cancel");
        c.add(cancelBtn);
//----------------------------------------------------------------
        this.setSize(300, 150);
        this.setVisible(true);

        loginBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String eMail = eMailField.getText();
                String password = passwordField.getText();
                System.out.println("Login Try Email : " + eMail);
                System.out.println("Login Password : " + password);
            }
        });

        cancelBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                eMailField.setText("");
                passwordField.setText("");

            }
        });
    }
}
