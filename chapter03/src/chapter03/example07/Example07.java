package chapter03.example07;

public class Example07 {
    public static void main(String[] args) {
        // 分别创建两个对象 ps1 和 ps2
        Person p1 = new Person("韩强");
        Person p2 = new Person("晓英", 27);
        // 通过对象ps1 和 ps2 调用speak()方法
        p1.speak();
        p2.speak();
    }
}

/**
 * 构造方法的重载
 */
class Person {
    String name;
    int age;

    // 定义两个参数的构造方法
    public Person(String con_name, int con_age) {
        name = con_name; // 为name属性赋值
        age = con_age; // 为age属性赋值
    }

    // 定义一个参数的构造方法
    public Person(String con_name) {
        name = con_name; // 为name属性赋值
    }

    public void speak() {
        // 打印name和age的值
        System.out.println("大家好，我叫" + name + ",我今年" + age + "岁!");
    }
}


