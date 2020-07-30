package chapter03.example14;

/**
 * 静态代码块
 */
class Example14 {
    // 静态代码块
    static {
        System.out.println("测试类的静态代码块执行了");
    }

    public static void main(String[] args) {
        // 下面的代码创建了两个Person对象
        Person p1 = new Person();
        Person p2 = new Person();
    }
}

class Person {
    // 下面是一个静态代码块
    static {
        System.out.println("Person类中的静态代码块执行了");
    }
}
