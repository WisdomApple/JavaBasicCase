package chapter08.example16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * JDialog对话框
 */
public class Example16 {
    public static void main(String[] args) {
        // 建立两个按钮
        JButton btn1 = new JButton("模态对话框");
        JButton btn2 = new JButton("非模态对话框");
        JFrame f = new JFrame("DialogDemo");
        f.setSize(300, 250);
        f.setLocation(300, 200);
        f.setLayout(new FlowLayout()); // 为内容面板设置布局管理器
        // 在Container对象上添加按钮
        f.add(btn1);
        f.add(btn2);
        // 设置单击关闭按钮默认关闭窗口
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        final JLabel label = new JLabel();
        final JDialog dialog = new JDialog(f, "Dialog"); // 定义一个JDialog对话框
        dialog.setSize(220, 150); // 设置对话框大小
        dialog.setLocation(350, 250); // 设置对话框位置
        dialog.setLayout(new FlowLayout()); // 设置布局管理器
        final JButton btn3 = new JButton("确定"); // 创建按钮对象
        dialog.add(btn3); // 在对话框的内容面板添加按钮
        // 为"模态对话框"按钮添加单击事件
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 设置对话框为模态
                dialog.setModal(true);
                // 如果JDialog窗口中没有添加了JLabel标签，就把JLabel标签加上
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                // 否则修改标签的内容
                label.setText("模式对话框，点击确定按钮关闭");
                // 显示对话框
                dialog.setVisible(true);
            }
        });
        // 为"非模态对话框"按钮添加单击事件
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 设置对话框为非模态
                dialog.setModal(false);
                // 如果JDialog窗口中没有添加了JLabel标签，就把JLabel标签加上
                if (dialog.getComponents().length == 1) {
                    dialog.add(label);
                }
                // 否则修改标签的内容
                label.setText("非模式对话框，点击确定按钮关闭");
                // 显示对话框
                dialog.setVisible(true);
            }
        });
        // 为对话框中的按钮添加单击事件
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });
    }
}
