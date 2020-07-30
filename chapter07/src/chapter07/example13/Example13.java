package chapter07.example13;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 遍历指定目录下所有扩展名为.txt的文件
 */
public class Example13 {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("./");
        // 创建过滤器对象
        FilenameFilter filter = new FilenameFilter() {
            // 实现accept()方法
            public boolean accept(File dir, String name) {
                File currFile = new File(dir, name);
                // 如果文件名以.txt结尾返回true，否则返回false
                return currFile.isFile() && name.endsWith(".txt");
            }
        };
        if (file.exists()) { // 判断File对象对应的目录是否存在
            String[] lists = file.list(filter); // 获得过滤后的所有文件名数组
            for (String name : lists != null ? lists : new String[0]) {
                System.out.println(name);
            }
        }
    }
}