package proj0402;

import javax.swing.*;
import java.awt.*;

public class LoginEx extends JFrame {
    public LoginEx() {
        setTitle("LOGIN FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(3, 2);
        grid.setVgap(2);
        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel("이메일"));
        c.add(new JTextField(""));
        c.add(new JLabel("비밀번호"));
        c.add(new JTextField(""));
        c.add(new JButton("로그인"));
        c.add(new JButton("취소"));
        setSize(300, 150);
        setVisible(true);
    }
}
