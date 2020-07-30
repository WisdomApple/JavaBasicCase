package chapter10.example13;

public class Example13 {
    public static void main(String[] args) {
        // 创建两个DeadLockThread对象
        DeadLockThread d1 = new DeadLockThread(true);
        DeadLockThread d2 = new DeadLockThread(false);
        // 创建并开启两个线程
        new Thread(d1, "Chinese").start();   // 创建开启线程Chinese
        new Thread(d2, "American").start(); // 创建开启线程American
    }
}

/**
 * 死锁
 */
class DeadLockThread implements Runnable {
    static Object chopsticks = new Object();    // 定义Object类型的chopsticks锁对象
    static Object knifeAndFork = new Object();  // 定义Object类型的knifeAndFork锁对象
    private boolean flag; // 定义boolean类型的变量flag

    DeadLockThread(boolean flag) { // 定义有参的构造方法
        this.flag = flag;
    }

    public void run() {
        if (flag) {
            while (true) {
                synchronized (chopsticks) { // chopsticks锁对象上的同步代码块
                    System.out.println(Thread.currentThread().getName()
                            + "---if---chopsticks");
                    synchronized (knifeAndFork) { // knifeAndFork锁对象上的同步代码块
                        System.out.println(Thread.currentThread().getName()
                                + "---if---knifeAndFork");
                    }
                }
            }
        } else {
            while (true) {
                synchronized (knifeAndFork) { // knifeAndFork锁对象上的同步代码块
                    System.out.println(Thread.currentThread().getName()
                            + "---else---knifeAndFork");
                    synchronized (chopsticks) { // chopsticks锁对象上的同步代码块
                        System.out.println(Thread.currentThread().getName()
                                + "---else---chopsticks");
                    }
                }
            }
        }
    }
}
