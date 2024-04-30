package proj0402;

import javax.swing.*;
import java.awt.*;

public class Myframe extends JFrame {
    public Myframe(){
        this.setTitle("첫번쨰 프레임");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        Myframe myframe = new Myframe();
        System.out.println(myframe.getSize());

    }
}