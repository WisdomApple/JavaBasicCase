package chapter04.example04;

// 定义测试类
public class Example04 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 实例化子类Dog对象
    }
}

// 定义Animal类
class Animal {
    // 定义Animal类有参的构造方法
    public Animal(String name) {
        System.out.println("我是一只" + name);
    }
}

// 定义Dog类继承Animal类
class Dog extends Animal {
    public Dog() {
        super("沙皮狗"); // 调用父类有参的构造方法
    }
}
