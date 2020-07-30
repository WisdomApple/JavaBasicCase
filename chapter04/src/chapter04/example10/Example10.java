package chapter04.example10;

// 定义测试类
public class Example10 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 创建Dog类的实例对象
        dog.shout(); // 调用dog对象是的shout()方法
    }
}

// 定义抽象类Animal
abstract class Animal {
    // 定义抽象方法shout()
    abstract void shout();
}

// 定义Dog类继承抽象类Animal
class Dog extends Animal {
    // 实现抽象方法shout()
    void shout() {
        System.out.println("汪汪……");
    }
}


