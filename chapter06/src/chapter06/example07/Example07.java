package chapter06.example07;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet集合的用法
 */
public class Example07 {
    public static void main(String[] args) {
        HashSet set = new HashSet();   // 创建HashSet集合
        set.add("Jack");                 // 向该Set集合中添加字符串
        set.add("Eve");
        set.add("Rose");
        set.add("Rose");                 // 向该Set集合中添加重复元素
        Iterator it = set.iterator(); // 获取Iterator对象
        while (it.hasNext()) {         // 通过while循环，判断集合中是否有元素
            Object obj = it.next();   // 如果有元素，就通过迭代器的next()方法获取元素
            System.out.println(obj);
        }
    }
}