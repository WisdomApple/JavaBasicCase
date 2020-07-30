package chapter10.example08;

public class Example08 {
    public static void main(String[] args) {
        // 创建两个线程
        Thread t1 = new YieldThread("线程A");
        Thread t2 = new YieldThread("线程B");
        // 开启两个线程
        t1.start();
        t2.start();
    }
}

/**
 * 线程让步，yield()方法的使用
 */
// 定义YieldThread类继承Thread类
class YieldThread extends Thread {
    // 定义一个有参的构造方法
    public YieldThread(String name) {
        super(name); // 调用父类的构造方法
    }

    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
            if (i == 3) {
                System.out.print("线程让步:");
                Thread.yield(); // 线程运行到此，作出让步
            }
        }
    }
}

