package chapter08.example14;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Random;

/**
 * AWT绘图
 */
public class Example14 {
    public static void main(String[] args) {
        final Frame frame = new Frame("验证码"); // 创建Frame对象
        final Panel panel = new MyPanel(); // 创建Panel对象
        frame.add(panel);
        frame.setSize(200, 100);
        // 将Frame窗口居中
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class MyPanel extends Panel {
    public void paint(@NotNull Graphics g) {
        int width = 160; // 定义验证码图片的宽度
        int height = 40; // 定义验证码图片的高度
        g.setColor(Color.LIGHT_GRAY); // 设置上下文颜色
        g.fillRect(0, 0, width, height); // 填充验证码背景
        g.setColor(Color.BLACK); // 设置上下文颜色
        g.drawRect(0, 0, width - 1, height - 1); // 绘制边框
        // 绘制干扰点
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(width) - 2;
            int y = r.nextInt(height) - 2;
            g.drawOval(x, y, 2, 2);
        }
        g.setFont(new Font("黑体", Font.BOLD, 30)); // 设置验证码字体
        g.setColor(Color.BLUE); // 设置验证码颜色
        // 产生随机验证码
        char[] chars = ("0123456789abcdefghijkmnopqrstuvwxyzABCDEFG"
                + "HIJKLMNPQRSTUVWXYZ").toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int pos = r.nextInt(chars.length);
            char c = chars[pos];
            sb.append(c + " ");
        }
        g.drawString(sb.toString(), 20, 30); // 写入验证码
    }
}
