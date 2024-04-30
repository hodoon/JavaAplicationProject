package proj0402;

import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
    public ContentPaneEx(){
        this.setTitle("학번 이름"); //제목
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫을시 종료

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.yellow);
        contentPane.setLayout(new FlowLayout());

        JButton btOk = new JButton("Ok");
        contentPane.add(btOk);
        JButton btCancel = new JButton("Cancel");
        contentPane.add(btCancel);
        contentPane.add(new JButton("무시"));

        this.setSize(300, 150); //크기
        this.setVisible(true);
    }
    // 3.method
}
