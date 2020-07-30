package chapter08.example07;

import java.awt.*;

public class Example07 {
    public static void main(String[] args) {
        Frame f = new Frame("hello");
        f.setLayout(null); // 取消 frame的布局管理器
        f.setSize(300, 150);
        Button btn1 = new Button("press");
        Button btn2 = new Button("pop");
        btn1.setBounds(40, 60, 100, 30);
        btn2.setBounds(140, 90, 100, 30);
        // 在窗口中添加按钮
        f.add(btn1);
        f.add(btn2);
        f.setVisible(true);
    }
}
