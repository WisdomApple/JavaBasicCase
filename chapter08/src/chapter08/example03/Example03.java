package chapter08.example03;

import java.awt.*;

public class Example03 {
    public static void main(String[] args) {
        final Frame f = new Frame("BorderLayout");// 创建一个名为BorderLayout的窗体
        f.setLayout(new BorderLayout()); // 设置窗体中的布局管理器为BorderLayout
        f.setSize(300, 300); // 设置窗体大小
        f.setLocation(300, 200);// 设置窗体显示的位置
        f.setVisible(true); // 设置窗体可见
        // 下面的代码是创建5个按钮，分别用于填充BorderLayout的5个区域
        Button but1 = new Button("东部"); // 创建新按钮
        Button but2 = new Button("西部");
        Button but3 = new Button("南部");
        Button but4 = new Button("北部");
        Button but5 = new Button("中部");
        // 下面的代码是将创建好的按钮添加到窗体中，并设置按钮所在的区域
        f.add(but1, BorderLayout.EAST); // 设置按钮所在区域
        f.add(but2, BorderLayout.WEST);
        f.add(but3, BorderLayout.SOUTH);
        f.add(but4, BorderLayout.NORTH);
        f.add(but5, BorderLayout.CENTER);
    }
}
