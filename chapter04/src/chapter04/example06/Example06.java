package chapter04.example06;

// 定义测试类
class Example06 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 创建Dog类的实例对象
    }
}

// 使用final关键字修饰Animal类时，子类会报错
// final class Animal {
class Animal {
    // 方法体为空
}

// Dog类继承Animal类
class Dog extends Animal {
    // 方法体为空
}
