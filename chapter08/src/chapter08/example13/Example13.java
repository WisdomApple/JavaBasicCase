package chapter08.example13;

import java.awt.*;
import java.awt.event.*;

/**
 * 键盘事件
 *
 * @author admin
 */
public class Example13 {
    public static void main(String[] args) {
        Frame f = new Frame("KeyEvent");
        f.setLayout(new FlowLayout());
        f.setSize(400, 300);
        f.setLocation(300, 200);
        TextField tf = new TextField(30); // 创建文本框对象
        f.add(tf); // 在窗口中添加文本框组件
        f.setVisible(true);
        // 为文本框添加键盘事件监听器
        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int KeyCode = e.getKeyCode(); // 返回所按键对应的整数值
                String s = KeyEvent.getKeyText(KeyCode); // 返回按键的字符串描述
                System.out.print("输入的内容为：" + s + ",");
                System.out.println("对应的KeyCode为：" + KeyCode);
            }
        });
    }
}
