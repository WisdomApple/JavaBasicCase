package chapter04.example07;

// 定义测试类
class Example07 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 创建Dog类的实例对象
    }
}

// 定义Animal类
class Animal {
    // 使用final关键字修饰shout()方法后，如果子类重写父类的这个方法，编译会报错
    // public final void shout() {
    public void shout() {
        // 程序代码
    }
}

// 定义Dog类继承Animal类
class Dog extends Animal {
    // 重写Animal类的shout()方法
    public void shout() {
        // 程序代码
    }
}

