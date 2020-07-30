package chapter06.example17;

import java.util.ArrayList;

/**
 * 泛型的使用
 */
public class Example17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// 创建ArrayList集合，使用泛型
        list.add("String");             // 添加字符串对象
        list.add("Collection");
        for (String str : list) {     // 遍历集合
            System.out.println(str);
        }
    }
}