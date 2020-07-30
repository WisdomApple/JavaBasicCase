package chapter04.example02;

// 定义测试类
public class Example02 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 创建Dog类的实例对象
        dog.shout(); // 调用dog重写的shout()方法
    }
}

// 定义Animal类
class Animal {
    // 定义动物叫的方法
    void shout() {
        System.out.println("动物发出叫声");
    }
}

// 定义Dog类继承动物类
class Dog extends Animal {
    // 定义狗叫的方法
    void shout() {
        System.out.println("汪汪汪……");
    }
}
