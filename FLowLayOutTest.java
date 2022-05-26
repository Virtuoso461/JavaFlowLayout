package Study;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class FLowLayOutTest extends JFrame {
    
    JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT,80,30));
    JButton jb1 = new JButton("测试按钮1");
    JButton jb2 = new JButton("测试按钮2");
    JButton jb3 = new JButton("测试按钮3");
    JButton jb4 = new JButton("测试按钮4");
    JButton jb5 = new JButton("测试按钮5");
    JButton jb6 = new JButton("测试按钮6");
    JButton jb7 = new JButton("测试按钮7");
    JButton jb8 = new JButton("测试按钮8");
    JButton jb9 = new JButton("测试按钮9");
    JButton jb10 = new JButton("测试按钮10");


    FLowLayOutTest() {
        super("这是JFrame的标题");

        Container container = getContentPane();
        jPanel.add(jb1);
        jPanel.add(jb2);
        jPanel.add(jb3);
        jPanel.add(jb4);
        jPanel.add(jb5);
        jPanel.add(jb6);
        jPanel.add(jb7);
        jPanel.add(jb8);
        jPanel.add(jb9);
        jPanel.add(jb10);
        container.add(jPanel);

        setSize(600,400);

        URL resource = JFrameTest.class.getResource("校标.png");
        Image image = new ImageIcon(resource).getImage();
        setIconImage(image);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FLowLayOutTest();
    }
}
