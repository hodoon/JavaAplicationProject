package proj0402;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx(){
        setTitle("FlowLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//제목
        Container content = getContentPane();

        content.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        content.add(new JButton("add"));
        content.add(new JButton("sub"));
        content.add(new JButton("mul"));
        content.add(new JButton("div"));
        content.add(new JButton("contentalculate"));

        setSize(300, 200);
        setVisible(true);
    }
}
