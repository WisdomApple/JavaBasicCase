package chapter08.example21;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * JComboBox组件
 */
public class Example21 extends JFrame {
    private JComboBox comboBox; // 定义一个JComboBox组合框
    private JTextField field; // 定义一个JTextField文本框

    public Example21() {
        JPanel panel = new JPanel(); // 创建JPanel面板
        comboBox = new JComboBox();
        // 为组合框添加选项
        comboBox.addItem("请选择城市");
        comboBox.addItem("北京");
        comboBox.addItem("天津");
        comboBox.addItem("南京");
        comboBox.addItem("上海");
        comboBox.addItem("重庆");
        // 为组合框添加事件监听器
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String item = (String) comboBox.getSelectedItem();
                if ("请选择城市".equals(item)) {
                    field.setText("");
                } else {
                    field.setText("您选择的城市是：" + item);
                }
            }
        });
        field = new JTextField(20);
        panel.add(comboBox); // 在面板中添加组合框
        panel.add(field); // 在面板中添加文本框
        // 在内容面板中添加JPanel面板
        this.add(panel, BorderLayout.NORTH);
        this.setSize(350, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example21();
    }
}
