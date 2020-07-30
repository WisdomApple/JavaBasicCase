package chapter08.fruitstore.controller;

import chapter08.fruitstore.view.AbstractMainFrame;

/**
 * 主界面操作类
 */
@SuppressWarnings("serial")
public class MainFrameController extends AbstractMainFrame {
    @Override
    public void showAdminDialog() {
        // 在该方法中创建管理员界面并显示
        // this为父窗口(主界面)  true：设置为模态窗口展示
        new AdminDialogController(this, true).setVisible(true);
    }
}
