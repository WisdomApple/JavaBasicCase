package chapter08.fruitstore.controller;

import chapter08.fruitstore.view.AbstractAdminDialog;
import chapter08.fruitstore.domain.FruitItem;
import chapter08.fruitstore.service.AdminService;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * 管理员界面操作类
 */
@SuppressWarnings("serial")
public class AdminDialogController extends AbstractAdminDialog {
    // 定义服务类，提供完整功能服务
    private AdminService adminService = new AdminService();

    // 构造方法
    public AdminDialogController() {
        super();
    }

    public AdminDialogController(JFrame owner, boolean modal) {
        super(owner, modal);
        // 创建对象时展示数据
        queryFruitItem();
    }

    // 查询方法
    @Override
    public void queryFruitItem() {
        // 定义表格头
        String[] thead = {"水果编号", "水果名称", "水果单价(/元)", "计价单位"};

        // 调用adminService的查询服务
        ArrayList<FruitItem> dataList = adminService.queryFruitItem();
        //调用list2Array方法，将查询到的集合转为数组，方便为JTable赋值
        String[][] tbody = list2Array(dataList);
        // 将查询到的结果为table赋值
        TableModel dataModel = new DefaultTableModel(tbody, thead);
        table.setModel(dataModel);
    }

    // 集合数据转为二维数组方法
    public String[][] list2Array(@NotNull ArrayList<FruitItem> list) {
        // 根据FruitItem的model与集合数据定义JTable的数据二维数组
        String[][] tbody = new String[list.size()][4];
        for (int i = 0; i < list.size(); i++) {
            FruitItem fruitItem = list.get(i);
            tbody[i][0] = fruitItem.getNumber();
            tbody[i][1] = fruitItem.getName();
            tbody[i][2] = fruitItem.getPrice() + "";
            tbody[i][3] = fruitItem.getUnit();
        }
        return tbody;
    }

    // 添加方法
    @Override
    public void addFruitItem() {
        // 获取数据
        String addNumber = addNumberText.getText();
        String addName = addNameText.getText();
        String addPrice = addPriceText.getText();
        String addUnit = addUnitText.getText();
        //调用adminService的添加服务
        boolean addSuccess = adminService.addFruitItem(addNumber, addName,
                addPrice, addUnit);
        //如果添加成功
        if (addSuccess) {
            //添加后刷新表格
            queryFruitItem();
        } else {
            //没有添加成功弹窗错误提示
            JOptionPane.showMessageDialog(this, "水果编号不能重复，请检查数据!");
        }
    }

    //修改方法
    @Override
    public void updateFruitItem() {
        //获取数据
        String updateNumber = updateNumberText.getText();
        String updateName = updateNameText.getText();
        String updatePrice = updatePriceText.getText();
        String updateUnit = updateUnitText.getText();
        // 调用adminService的修改服务
        boolean updateSuccess = adminService.updateFruitItem(updateNumber,
                updateName, updatePrice, updateUnit);
        // 如果修改成功
        if (updateSuccess) {
            // 修改后刷新表格
            queryFruitItem();
        } else {
            // 没有修改成功弹窗错误提示
            JOptionPane.showMessageDialog(this, "没有这个编号的水果，请检查数据!");
        }
    }

    // 删除方法
    @Override
    public void delFruitItem() {
        // 获取数据
        String delNumber = delNumberText.getText();
        // 调用adminService的删除服务
        boolean delSuccess = adminService.delFruitItem(delNumber);
        // 如果删除成功
        if (delSuccess) {
            // 删除后刷新表格
            queryFruitItem();
        } else {
            // 没有删除成功弹窗错误提示
            JOptionPane.showMessageDialog(this, "没有这个编号的水果,请检查数据!");
        }
    }
}