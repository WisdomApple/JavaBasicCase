package chapter04.example12;// 定义测试类

public class Example12 {
    public static void main(String args[]) {
        Dog dog = new Dog(); // 创建Dog类的实例对象
        // 使用对象名.常量名的方式输出接口中的常量
        // System.out.println(dog.ANIMAL_BEHAVIOR);
        // 使用接口名.常量名的方式输出接口中的常量
        // System.out.println(Animal.ANIMAL_BEHAVIOR);
        dog.breathe();      // 调用Dog类的breathe()方法
        dog.run();          // 调用Dog类的run()方法
        dog.liveOnLand();   // 调用Dog类的liveOnLand()方法
    }
}

// 定义了Animal接口
interface Animal {
    // 定义全局常量,其默认修饰为public static final
    String ANIMAL_BEHAVIOR = "动物的行为";

    // 定义抽象方法breathe()，其默认修饰为public abstract
    void breathe();

    // 定义抽象方法run()
    void run();
}

// 定义了LandAnimal接口
interface LandAnimal extends Animal {
    void liveOnLand();
}

// Dog类实现了Animal接口
class Dog implements LandAnimal {
    // 实现breathe()方法
    public void breathe() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在呼吸");
    }

    // 实现run()方法
    public void run() {
        System.out.println(ANIMAL_BEHAVIOR + ":" + "狗在奔跑");
    }

    // 实现liveOnLand()方法
    public void liveOnLand() {
        System.out.println("狗是陆地上的动物。。。");
    }
}
