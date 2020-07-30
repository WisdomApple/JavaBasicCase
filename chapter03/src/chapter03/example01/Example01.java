package chapter03.example01;

/**
 * 访问对象的成员
 */
class Example01 {
    public static void main(String[] args) {
        Person p1 = new Person(); // 创建第一个Person对象
        Person p2 = new Person(); // 创建第二个Person对象
        p1.age = 18; // 为age属性赋值
        p1.speak(); // 调用对象的方法
        p2.speak();
    }
}
