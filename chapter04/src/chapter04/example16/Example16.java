package chapter04.example16;

// 定义测试类
public class Example16 {
    public static void main(String[] args) {
        Animal animal = new Animal(); // 创建Animal类对象
        System.out.println(animal.toString()); // 调用toString()方法并打印
    }
}

// 定义Animal类
class Animal {
    // 定义动物叫的方法
    void shout() {
        System.out.println("动物叫！");
    }
}
