package chapter04.example14;// 定义测试类

public class Example14 {
    public static void main(String[] args) {
        Cat cat = new Cat(); // 创建Cat类的实例对象
        animalShout(cat); // 调用animalShout()方法，将cat作为参数传入
    }

    // 定义静态方法animalShout()，接收一个Animal类型的参数
    public static void animalShout(Animal animal) {
        //animal.shout(); // 调用传入参数animal的shout()方法
        //animal.sleep(); // 调用传入参数animal的sleep()方法
        Cat cat = (Cat) animal;
        cat.shout();
        cat.sleep();
    }
}

// 定义Animal接口
interface Animal {
    void shout(); // 定义抽象方法shout()
}

// 定义Cat类实现Animal接口
class Cat implements Animal {
    // 实现抽象方法shout()
    public void shout() {
        System.out.println("喵喵……");
    }

    // 定义sleep()方法
    void sleep() {
        System.out.println("猫睡觉……");
    }
}

