package proj0416;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelfIntroduce extends JFrame{
    public SelfIntroduce(){
        this.setTitle("SelfIntroduce");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        GridLayout grid = new GridLayout(5, 2);
        grid.setVgap(5);

        Container cp = this.getContentPane();
        cp.setLayout(grid);

        cp.add(new JLabel("Name"));
        JTextField nameField = new JTextField(" ");
        cp.add(nameField);

        cp.add(new JLabel("Majors"));
        JTextField majorField = new JTextField(" ");
        cp.add(majorField);

        cp.add(new JLabel("Address"));
        JTextField addressField = new JTextField(" ");
        cp.add(addressField);

        JButton check = new JButton("Check");
        cp.add(check);

        JButton cancel = new JButton("Cancel");
        cp.add(cancel);

        setSize(300, 200);
        setVisible(true);

        check.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String major = majorField.getText();
                String address = addressField.getText();

                System.out.println("Name : " + name);
                System.out.println("major : " + major);
                System.out.println("address : " + address);
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                majorField.setText("");
                addressField.setText("");
            }
        });
    }
}
