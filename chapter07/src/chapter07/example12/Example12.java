package chapter07.example12;

import java.io.File;

/**
 * list()方法的用法
 */
public class Example12 {
    public static void main(String[] args) {
        File file = new File("./"); // 创建File对象
        if (file.isDirectory()) { // 判断File对象对应的目录是否存在
            String[] names = file.list(); // 获得目录下的所有文件的文件名
            if (names != null) {
                for (String name : names) {
                    System.out.println(name); // 输出文件名
                }
            }
        }
    }
}