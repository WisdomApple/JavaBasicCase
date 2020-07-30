package chapter10.example06;

/**
 * 不同优先级的两个线程在程序中运行情况
 */
public class Example06 {
    public static void main(String[] args) {
        //创建两个线程
        Thread minPriority = new Thread(new Task(), "优先级较低的线程 ");
        Thread maxPriority = new Thread(new Task(), "优先级较高的线程 ");
        minPriority.setPriority(Thread.MIN_PRIORITY); //设置线程的优先级为1
        maxPriority.setPriority(Thread.MAX_PRIORITY); //设置线程的优先级为10
        //开启两个线程
        minPriority.start();
        maxPriority.start();
    }
}

//定义一个线程的任务类
class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "正在输出" + i);
        }
    }
}