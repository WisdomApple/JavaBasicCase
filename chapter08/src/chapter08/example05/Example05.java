package chapter08.example05;

import java.awt.*;

class Layout extends Frame {
    public Layout(String title) {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        this.setLayout(layout);
        c.fill = GridBagConstraints.BOTH; // 设置组件横向纵向可以拉伸
        c.weightx = 1; // 设置横向权重为1
        c.weighty = 1; // 设置纵向权重为1
        this.addComponent("btn1", layout, c);
        this.addComponent("btn2", layout, c);
        this.addComponent("btn3", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER; // 添加的组件是本行最后一个组件
        this.addComponent("btn4", layout, c);
        c.weightx = 0; // 设置横向权重为0
        c.weighty = 0; // 设置纵向权重为0
        addComponent("btn5", layout, c);
        c.gridwidth = 1; // 设置组件跨一个网格(默认值)
        this.addComponent("btn6", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER; // 添加的组件是本行最后一个组件
        this.addComponent("btn7", layout, c);
        c.gridheight = 2; // 设置组件纵向跨两个网格
        c.gridwidth = 1; // 设置组件横向跨一个网格
        c.weightx = 2; // 设置横向权重为2
        c.weighty = 2; // 设置纵向权重为2
        this.addComponent("btn8", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = 1;
        this.addComponent("btn9", layout, c);
        this.addComponent("btn10", layout, c);
        this.setTitle(title);
        this.pack();
        this.setVisible(true);
    }

    // 增加组件的方法
    private void addComponent(String name, GridBagLayout layout,
                              GridBagConstraints c) {
        Button bt = new Button(name); // 创建一个名为name的按钮
        layout.setConstraints(bt, c); // 设置GridBagConstraints对象和按钮的关联
        this.add(bt); // 增加按钮
    }
}

public class Example05 {
    public static void main(String[] args) {
        new Layout("GridBagLayout");
    }
}
