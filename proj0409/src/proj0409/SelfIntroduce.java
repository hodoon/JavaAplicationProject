package proj0409;

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

        cp.add(new JLabel("School Number"));
        JTextField snField = new JTextField(" ");
        cp.add(snField);

        cp.add(new JLabel("Majors"));
        JTextField majorField = new JTextField(" ");
        cp.add(majorField);

        cp.add(new JLabel("Subject"));
        JTextField subjectField = new JTextField(" ");
        cp.add(subjectField);

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
                String sn = snField.getText();
                String major = majorField.getText();
                String subject = subjectField.getText();

                System.out.println("Name : " + name);
                System.out.println("School number : " + sn);
                System.out.println("major : " + major);
                System.out.println("subject : " + subject);
            }
        });

        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                snField.setText("");
                majorField.setText("");
                subjectField.setText("");
            }
        });
    }
}
