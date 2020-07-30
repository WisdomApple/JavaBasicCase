package chapter06.example13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map的用法
 * values()方法的使用
 */
public class Example13 {
    public static void main(String[] args) {
        Map map = new HashMap(); // 创建Map集合
        map.put("1", "Jack");     // 存储键和值
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Collection values = map.values();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object value = it.next();
            System.out.println(value);
        }
    }
}