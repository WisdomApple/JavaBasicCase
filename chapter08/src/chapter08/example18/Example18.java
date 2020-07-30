package chapter08.example18;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 文本组件JTextField和JTextArea组件的使用
 */
public class Example18 extends JFrame {
    JButton sendBt;
    JTextField inputField;
    JTextArea chatContent;

    public Example18() {
        this.setLayout(new BorderLayout());
        chatContent = new JTextArea(12, 34); // 创建一个文本域
        // 创建一个滚动面板，将文本域作为其显示组件
        JScrollPane showPanel = new JScrollPane(chatContent);
        chatContent.setEditable(false); // 设置文本域不可编辑
        JPanel inputPanel = new JPanel(); // 创建一个JPanel面板
        inputField = new JTextField(20); // 创建一个文本框
        sendBt = new JButton("发送"); // 创建一个发送按钮
        // 为按钮添加事件
        sendBt.addActionListener(new ActionListener() { // 为按钮添加一个监听事件
            public void actionPerformed(ActionEvent e) {// 重写actionPerformed方法
                String content = inputField.getText(); // 获取输入的文本信息
                // 判断输入的信息是否为空
                if (content != null && !content.trim().equals("")) {
                    // 如果不为空，将输入的文本追加到到聊天窗口
                    chatContent.append("本人:" + content + "\n");
                } else {
                    // 如果为空，提示聊天信息不能为空
                    chatContent.append("聊天信息不能为空" + "\n");
                }
                inputField.setText(""); // 将输入的文本域内容置为空
            }
        });
        Label label = new Label("聊天信息"); // 创建一个标签
        inputPanel.add(label); // 将标签添加到JPanel面板
        inputPanel.add(inputField); // 将文本框添加到JPanel面板
        inputPanel.add(sendBt); // 将按钮添加到JPanel面板
        // 将滚动面板和JPanel面板添加到JFrame窗口
        this.add(showPanel, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.SOUTH);
        this.setTitle("聊天窗口");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example18();
    }
}
