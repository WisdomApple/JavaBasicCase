package chapter10.example07;

/**
 * sleep(long millis) 方法在程序中的使用
 */
public class Example07 {
    public static void main(String[] args) throws Exception {
        //创建一个线程
        new Thread(new Task()).start();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                Thread.sleep(2000); //当前main主线程 休眠2秒
            } else {
                Thread.sleep(500);
            }
            System.out.println("main主线程正在输出：" + i);
        }
    }
}

//定义线程的任务类
class Task implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                if (i == 3) {
                    Thread.sleep(2000);//当前线程休眠2秒
                } else {
                    Thread.sleep(500);
                }
                System.out.println("线程一正在输出：" + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}