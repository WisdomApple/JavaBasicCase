package chapter06.example14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的用法
 * LinkedHashMap的用法
 */
public class Example14 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();      // 创建Map集合
        map.put("1", "Jack");              // 存储键和值
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key); // 获取每个键所对应的值
            System.out.println(key + ": " + value);
        }
    }
}
