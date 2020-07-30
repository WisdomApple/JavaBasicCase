package chapter08.fruitstore.view;

import chapter08.fruitstore.tools.GUITools;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 管理窗口类
 */
@SuppressWarnings("serial")
public abstract class AbstractAdminDialog extends JDialog {
    // 定义界面使用到的组件作为成员变量
    private JLabel tableLabel = new JLabel("水果列表");// 水果列表标题
    private JScrollPane tablePane = new JScrollPane();// 滚动视口
    protected JTable table = new JTable(); // 水果列表
    private JLabel numberLabel = new JLabel("水果编号");// 编号标题
    private JLabel nameLabel = new JLabel("水果名称");// 名称标题
    private JLabel priceLabel = new JLabel("水果单价");// 单价标题
    private JLabel unitLabel = new JLabel("计价单位");// 计价单位标题
    // 添加功能组件
    protected JTextField addNumberText = new JTextField(6);// 添加编号文本框
    protected JTextField addNameText = new JTextField(6);// 添加名称文本框
    protected JTextField addPriceText = new JTextField(6);// 添加单价文本框
    protected JTextField addUnitText = new JTextField(6);// 添加计价单位文本框
    private JButton addBtn = new JButton("添加水果");// 添加按钮
    // 修改功能组件
    protected JTextField updateNumberText = new JTextField(6);// 修改编号文本框
    protected JTextField updateNameText = new JTextField(6);// 修改名称文本框
    protected JTextField updatePriceText = new JTextField(6);// 修改单价文本框
    protected JTextField updateUnitText = new JTextField(6);// 修改计价单位文本框
    private JButton updateBtn = new JButton("修改水果");// 修改按钮
    //删除功能组件
    protected JTextField delNumberText = new JTextField(6);// 添加编号文本
    private JButton delBtn = new JButton("删除水果");// 删除按钮

    //构造方法
    public AbstractAdminDialog() {
        this(null, true);
    }

    public AbstractAdminDialog(JFrame owner, boolean modal) {
        super(owner, modal);
        this.init();// 初始化操作
        this.addComponent();// 添加组件
        this.addListener();// 添加监听器
    }

    // 初始化操作
    private void init() {
        this.setTitle("超市货物管理!");// 标题
        this.setSize(600, 400);// 窗体大小与位置
        GUITools.center(this);// 设置窗口在屏幕上的位置
        this.setResizable(false);// 窗体大小固定
    }

    // 添加组件
    private void addComponent() {
        // 取消布局
        this.setLayout(null);
        // 表格标题
        tableLabel.setBounds(265, 20, 70, 25);
        this.add(tableLabel);
        // 表格
        table.getTableHeader().setReorderingAllowed(false);    // 列不能移动
        table.getTableHeader().setResizingAllowed(false);    // 不可拉动表格
        table.setEnabled(false);                            // 不可更改数据
        tablePane.setBounds(50, 50, 500, 200);
        tablePane.setViewportView(table);                    // 视口装入表格
        this.add(tablePane);
        // 字段标题
        numberLabel.setBounds(50, 250, 70, 25);
        nameLabel.setBounds(150, 250, 70, 25);
        priceLabel.setBounds(250, 250, 70, 25);
        unitLabel.setBounds(350, 250, 70, 25);
        this.add(numberLabel);
        this.add(nameLabel);
        this.add(priceLabel);
        this.add(unitLabel);
        // 增加组件
        addNumberText.setBounds(50, 280, 80, 25);
        addNameText.setBounds(150, 280, 80, 25);
        addPriceText.setBounds(250, 280, 80, 25);
        addUnitText.setBounds(350, 280, 80, 25);
        this.add(addNumberText);
        this.add(addNameText);
        this.add(addPriceText);
        this.add(addUnitText);
        addBtn.setBounds(460, 280, 90, 25);
        this.add(addBtn);
        // 修改组件
        updateNumberText.setBounds(50, 310, 80, 25);
        updateNameText.setBounds(150, 310, 80, 25);
        updatePriceText.setBounds(250, 310, 80, 25);
        updateUnitText.setBounds(350, 310, 80, 25);
        this.add(updateNumberText);
        this.add(updateNameText);
        this.add(updatePriceText);
        this.add(updateUnitText);
        updateBtn.setBounds(460, 310, 90, 25);
        this.add(updateBtn);
        // 删除组件
        delNumberText.setBounds(50, 340, 80, 25);
        this.add(delNumberText);
        delBtn.setBounds(460, 340, 90, 25);
        this.add(delBtn);
    }

    // 添加监听器
    private void addListener() {
        // 添加按钮监听
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 调用添加方法
                addFruitItem();
            }
        });
        // 修改按钮监听
        updateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 调用修改方法
                updateFruitItem();
            }
        });
        // 删除按钮监听
        delBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 调用删除方法
                delFruitItem();
            }
        });
    }

    //查询方法
    public abstract void queryFruitItem();

    //添加方法
    public abstract void addFruitItem();

    //修改方法
    public abstract void updateFruitItem();

    //删除方法
    public abstract void delFruitItem();
}
