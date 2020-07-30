package chapter03.example10;

public class Example10 {
    public static void main(String[] args) {
        Person p = new Person("Java"); // 实例化 Person 对象
    }
}

/**
 * 构造方法中使用this
 */
class Person {
    public Person() {
        System.out.println("无参的构造方法被调用了...");
    }

    public Person(String name) {
        this(); // 调用无参的构造方法
        System.out.println("有参的构造方法被调用了...");
    }
}


