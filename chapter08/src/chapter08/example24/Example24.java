package chapter08.example24;

import javax.swing.*;

/**
 * JTable
 */
public class Example24 {
    //创建JFrame窗口
    JFrame jf = new JFrame("简单表格");
    //声明JTable类型的变量table
    JTable table;
    // 1.定义一维数组作为列标题
    Object[] columnTitle = {"姓名", "年龄", "性别"};
    // 2.定义二维数组作为表格行对象数据
    Object[][] tableDate = {
            new Object[]{"李清照", 29, "女"},
            new Object[]{"苏格拉底", 56, "男"},
            new Object[]{"李白", 35, "男"},
            new Object[]{"弄玉", 18, "女"},
            new Object[]{"虎头", 2, "男"}
    };

    // 3.使用JTable对象创建表格
    public void init() {
        // 以二维数组和一维数组来创建一个JTable对象
        table = new JTable(tableDate, columnTitle);
        // 将JTable对象放在JScrollPane中，并将该JScrollPane放在窗口中显示出来
        jf.add(new JScrollPane(table));
        //设置自适应JFrame窗体大小
        jf.pack();
        //设置单击关闭按钮时默认为退出
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗体可见
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Example24().init();
    }
}
