package chapter08.example08;

import java.awt.*;
import java.awt.event.*;

public class Example08 {
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
        MyWindowListener mw = new MyWindowListener();
        f.addWindowListener(mw);
    }
}

// 创建MyWindowListener类实现WindowListener接口
class MyWindowListener implements WindowListener {
    // 监听器监听事件对象作出处理
    public void windowClosing(WindowEvent e) {
        Window window = e.getWindow();
        window.setVisible(false);
        // 释放窗口
        window.dispose();
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowOpened(WindowEvent e) {
    }
}
