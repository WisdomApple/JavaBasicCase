package fruitstore.tools;

import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.JFrame;

/*
 * 工具类
 */
public class GUITools {
    //JAVA提供的GUI默认工具类对象
    static Toolkit kit = Toolkit.getDefaultToolkit();

    //将指定组件屏幕居中
    public static void center(Component c) {
        int x = (kit.getScreenSize().width - c.getWidth()) / 2;
        int y = (kit.getScreenSize().height - c.getHeight()) / 2;
        c.setLocation(x, y);
    }

    //为指定窗口设置图标标题
    public static void setTitleImage(JFrame frame, String titleIconPath) {
        frame.setIconImage(kit.createImage(titleIconPath));
    }
}
