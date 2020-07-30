package chapter08.example20;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * JRadioButton组件的用法
 */
public class Example20 extends JFrame {
    private ButtonGroup group; // 单选按钮组对象
    private JPanel panel; // JPanel面板放置三个JRadioButton按钮
    private JPanel pallet; // JPanel面板作为调色板

    public Example20() {
        pallet = new JPanel();
        this.add(pallet, BorderLayout.CENTER); // 将调色板面板放置了CENTER区域
        panel = new JPanel();
        group = new ButtonGroup();
        // 调用addJRadioButton()方法
        addJRadioButton("灰");
        addJRadioButton("粉");
        addJRadioButton("黄");
        this.add(panel, BorderLayout.SOUTH);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * JRadioButtion按钮的文本信息 用于创建一个带有文本信息的JRadioButton按钮
     * 将按钮添加到panel面板和ButtonGroup按钮组中 并添加监听器
     */
    private void addJRadioButton(final String text) {
        JRadioButton radioButton = new JRadioButton(text);
        group.add(radioButton);
        panel.add(radioButton);
        radioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color color = null;
                if ("灰".equals(text)) {
                    color = Color.GRAY;
                } else if ("粉".equals(text)) {
                    color = Color.PINK;
                } else if ("黄".equals(text)) {
                    color = Color.YELLOW;
                } else {
                    color = Color.WHITE;
                }
                pallet.setBackground(color);
            }
        });
    }

    public static void main(String[] args) {
        new Example20();
    }
}
