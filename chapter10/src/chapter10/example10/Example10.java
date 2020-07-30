package chapter10.example10;

/**
 * 售票程序，通过实现 Runnable接口的方式来创建多线程
 */
public class Example10 {
	public static void main(String[] args) {
		TicketWindow task = new TicketWindow();// 创建线程的任务类对象
		new Thread(task, "窗口1").start();// 创建线程并起名为窗口1， 开启线程
		new Thread(task, "窗口2").start();// 创建线程并起名为窗口2， 开启线程
		new Thread(task, "窗口3").start();// 创建线程并起名为窗口3， 开启线程
		new Thread(task, "窗口4").start();// 创建线程并起名为窗口4， 开启线程
	}
}
// 线程的任务类
class TicketWindow implements Runnable {
	private int tickets = 10; // 10张票
	@Override
	public void run() {
		while (tickets > 0) {
			try {
				Thread.sleep(10);// 线程休眠10毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---卖出的票"
					+ tickets--);
		}
	}
}