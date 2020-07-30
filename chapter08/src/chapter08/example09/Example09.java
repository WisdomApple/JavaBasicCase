package chapter08.example09;

import java.awt.*;
import java.awt.event.*;

public class Example09 {
    public static void main(String[] args) {
        // 建立新窗体
        Frame f = new Frame("我的窗体！");
        // 设置窗体的宽和高
        f.setSize(400, 300);
        // 设置窗体的出现的位置
        f.setLocation(300, 200);
        // 设置窗体可见
        f.setVisible(true);
        // 为窗口组件注册监听器
        f.addWindowListener(new MyWindowListener());
    }
}

// 继承WindowAdapter类，重写windowClosing()方法
class MyWindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        Window window = (Window) e.getComponent();
        window.dispose();
    }
}
