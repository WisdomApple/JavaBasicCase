package chapter04.example17;

// 定义测试类
public class Example17 {
    public static void main(String[] args) {
        Animal animal = new Animal(); // 创建Animal类对象
        System.out.println(animal.toString()); // 调用toString()方法并打印
    }
}

// 定义Animal类
class Animal {
    // 重写Object类的toString()方法
    public String toString() {
        return "这是一个动物。。。";
    }
}

