package chapter08.example04;

import java.awt.*;

public class Example04 {
    public static void main(String[] args) {
        Frame f = new Frame("GridLayout");// 创建一个名为GridLayout的窗体
        f.setLayout(new GridLayout(3, 3));// 设置该窗体为3*3的网格
        f.setSize(300, 300); // 设置窗体大小
        f.setLocation(400, 300);
        // 下面的代码是循环添加9个按钮到GridLayout中
        for (int i = 1; i <= 9; i++) {
            Button btn = new Button("btn" + i);
            f.add(btn); // 向窗体中添加按钮
        }
        f.setVisible(true);
    }
}
