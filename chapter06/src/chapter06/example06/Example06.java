package chapter06.example06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator迭代器删除集合中元素的两种方式
 */
public class Example06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // 创建ArrayList集合
        list.add("Jack");
        list.add("Annie");
        list.add("Rose");
        list.add("Tom");
        Iterator it = list.iterator(); // 获得Iterator对象
        while (it.hasNext()) {         // 判断该集合是否有下一个元素
            Object obj = it.next();    // 获取该集合中的元素
            if ("Annie".equals(obj)) { // 判断该集合中的元素是否为Annie
                //list.remove(obj);      // 删除该集合中的元素
                //break;               //1.删除对象后，跳出循环不再迭代
                it.remove();           //2.使用迭代器本身的移除方法
            }
        }
        System.out.println(list);
    }
}