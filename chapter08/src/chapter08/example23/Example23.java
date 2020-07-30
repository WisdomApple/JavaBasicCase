package chapter08.example23;

import java.awt.event.*;
import javax.swing.*;

public class Example23 extends JFrame {
    private JPopupMenu popupMenu;

    public Example23() {
        // 创建一个JPopupMenu菜单
        popupMenu = new JPopupMenu();
        // 创建三个JMenuItem菜单项
        JMenuItem refreshItem = new JMenuItem("refresh");
        JMenuItem createItem = new JMenuItem("create");
        JMenuItem exitItem = new JMenuItem("exit");
        // 为exitItem菜单项添加事件监听器
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // 往JPopupMenu菜单添加菜单项
        popupMenu.add(refreshItem);
        popupMenu.add(createItem);
        popupMenu.addSeparator();
        popupMenu.add(exitItem);
        // 为JFrame窗口添加clicked鼠标事件监听器
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // 如果单击的是鼠标的右键，显示JPopupMenu菜单
                if (e.getButton() == e.BUTTON3) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example23();
    }
}
