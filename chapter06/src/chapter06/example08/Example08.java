package chapter06.example08;

import java.util.HashSet;

/**
 * HashSet集合的用法
 */
public class Example08 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();                      // 创建HashSet集合
        Student stu1 = new Student("1", "Jack");   // 创建Student对象
        Student stu2 = new Student("2", "Rose");
        Student stu3 = new Student("2", "Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);
    }
}

class Student {
    String id;
    String name;

    public Student(String id, String name) {         // 创建构造方法
        this.id = id;
        this.name = name;
    }

    public String toString() {                          // 重写toString()方法
        return id + ":" + name;
    }
}
