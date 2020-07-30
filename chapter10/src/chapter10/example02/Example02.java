package chapter10.example02;

/**
 * 通过继承Thread类的方式来实现多线程
 */
public class Example02 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread(); // 创建线程MyThread的线程对象
        myThread.start(); // 开启线程
        while (true){ // 通过循环语句打印输出
            System.out.println("main()方法在运行");
        }
    }
}

class MyThread extends Thread {
    public void run() {
		while (true){ // 通过循环语句打印输出
            System.out.println("MyThread类的run()方法在运行");
        }
    }
}
