package chapter06.example04;

import java.util.ArrayList;

/**
 * foreach循环
 */
public class Example04 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // 创建ArrayList集合
        list.add("Jack"); // 向ArrayList集合中添加字符串元素
        list.add("Rose");
        list.add("Tom");
        for (Object obj : list) { // 使用foreach循环遍历ArrayList对象
            System.out.println(obj); // 取出并打印ArrayList集合中的元素
        }
    }
}