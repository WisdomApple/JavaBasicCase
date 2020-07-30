package chapter03.example09;

public class Example09 {
    public static void main(String[] args) {
        Person p = new Person();
    }
}

class Person {
    /*
     * private关键字修饰的构造方法Person()只能在Person类中被访问。
     * 也就是说Person()构造方法是私有的，不可以被外界调用，也就无法在类的外部创建该类的实例对象。
     * 因此，为了方便实例化对象，构造方法通常会使用public来修饰
     */
    public Person() {// 定义构造方法
        System.out.println("调用无参的构造方法");
    }
}