package chapter06.example02;

import java.util.LinkedList;

/**
 * LinkedList集合的使用
 */
public class Example02 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList(); // 创建LinkedList集合
        link.add("stu1");
        link.add("stu2");
        link.add("stu3");
        link.add("stu4");
        System.out.println(link.toString()); // 取出并打印该集合中的元素
        link.add(3, "Student"); // 向该集合中指定位置插入元素
        link.addFirst("First"); // 向该集合第一个位置插入元素
        System.out.println(link);
        System.out.println(link.getFirst()); // 取出该集合中第一个元素
        link.remove(3); // 移除该集合中指定位置的元素
        link.removeFirst(); // 移除该集合中第一个元素
        System.out.println(link);
    }
}