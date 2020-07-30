package chapter04.example15;

// 定义测试类
public class Example15 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 创建Dog类的实例对象
        animalShout(dog); // 调用animalShout()方法，将cat作为参数传入
    }

    // 定义静态方法animalShout()，接收一个Animal类型的参数
    public static void animalShout(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.shout();
            cat.sleep();
        } else {
            System.out.println("this animal is not a cat");
        }
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

// 定义Dog类实现Animal接口
class Dog implements Animal {
    // 实现shout()方法
    public void shout() {
        System.out.println("汪汪……");
    }
}

