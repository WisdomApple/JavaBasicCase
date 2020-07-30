package chapter08.example11;

import java.awt.*;
import java.awt.event.*;

/**
 * 窗体事件
 *
 * @author admin
 */
public class Example11 {
    public static void main(String[] args) {
        final Frame f = new Frame("WindowEvent");
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        // 使用内部类创建WindowListener实例对象，监听窗体事件
        f.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened---窗体打开事件");
            }

            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified---窗体图标化事件");
            }

            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified---窗体取消图标化事件");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated---窗体停用事件");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing---窗体正在关闭事件");
                ((Window) e.getComponent()).dispose();
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed---窗体关闭事件");
            }

            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated---窗体激活事件");
            }
        });
    }
}
