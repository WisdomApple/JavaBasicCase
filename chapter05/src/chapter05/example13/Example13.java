package chapter05.example13;

import java.io.IOException;

/**
 * 使用exec()方法打开记事本
 */
public class Example13 {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime(); // 创建Runtime实例对象
        rt.exec("notepad.exe"); // 调用exec()方法
    }
}