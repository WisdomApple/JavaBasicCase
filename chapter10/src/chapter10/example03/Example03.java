package chapter10.example03;

/**
 * 通过实现Runnable接口的方式来创建多线程
 */
public class Example03 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // 创建MyThread的实例对象
        Thread thread = new Thread(myThread); // 创建线程对象
        thread.start(); // 开启线程，执行线程中的run()方法
        while (true) {
            System.out.println("main()方法在运行");
        }
    }
}

class MyThread implements Runnable {
    public void run() { // 线程的代码段，当调用start()方法时，线程从此处开始执行
        while (true) {
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}