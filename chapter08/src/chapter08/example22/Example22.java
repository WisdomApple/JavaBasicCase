package chapter08.example22;

import java.awt.event.*;
import javax.swing.*;

/**
 * 菜单的创建和使用
 */
public class Example22 extends JFrame {
    public Example22() {
        JMenuBar menuBar = new JMenuBar(); // 创建菜单栏
        this.setJMenuBar(menuBar); // 将菜单栏添加到JFrame窗口中
        JMenu menu = new JMenu("操作"); // 创建菜单
        menuBar.add(menu); // 将菜单添加到菜单栏上
        // 创建两个菜单项
        JMenuItem item1 = new JMenuItem("弹出窗口");
        JMenuItem item2 = new JMenuItem("关闭");
        // 为菜单项添加事件监听器
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 创建一个JDialog窗口
                JDialog dialog = new JDialog(Example22.this, true);
                dialog.setTitle("弹出窗口");
                dialog.setSize(200, 200);
                dialog.setLocation(50, 50);
                dialog.setVisible(true);
            }
        });
        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(item1); // 将菜单项添加到菜单中
        menu.addSeparator(); // 添加一个分隔符
        menu.add(item2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example22();
    }
}
