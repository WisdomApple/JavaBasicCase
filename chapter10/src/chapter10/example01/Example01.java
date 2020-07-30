package chapter10.example01;

/**
 * 单线程程序
 */
public class Example01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // 创建MyThread实例对象
        myThread.run(); // 调用MyThread类的run()方法
        while (true) { // 该循环是一个死循环，打印输出语句
            System.out.println("Main方法在运行");
        }
    }
}

class MyThread {
    public void run() {
        while (true) { // 该循环是一个死循环，打印输出语句
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}