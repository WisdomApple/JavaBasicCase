package chapter06.example11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap的用法
 * 遍历集合中的元素，通过键值遍历
 */
public class Example11 {
    public static void main(String[] args) {
        Map map = new HashMap();            // 创建Map集合
        map.put("1", "Jack");               // 存储键和值
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Set keySet = map.keySet();         // 获取键的集合
        Iterator it = keySet.iterator();  // 迭代键的集合
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);  // 获取每个键所对应的值
            System.out.println(key + ": " + value);
        }
    }
}