package chapter08.example02;

import java.awt.*;

public class Example02 {
    public static void main(String[] args) {
        final Frame f = new Frame("Flowlayout");// 创建一个名为Flowlayout的窗体
        // 设置窗体中的布局管理器为FlowLayout，所有组件左对齐，水平间距为20，垂直间距为30
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        f.setSize(220, 300); // 设置窗体大小
        f.setLocation(300, 200); // 设置窗体显示的位置
        f.add(new Button("第1个按钮")); // 把"第1个按钮"添加到f窗口
        f.add(new Button("第2个按钮"));
        f.add(new Button("第3个按钮"));
        f.add(new Button("第4个按钮"));
        f.add(new Button("第5个按钮"));
        f.add(new Button("第6个按钮"));
        f.setVisible(true); // 设置窗体可见
    }
}
