package chapter10.task01;

/**
 * 测试类
 */
public class SaveMoneyTest {
	public static void main(String[] args) {
		Customer c = new Customer();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}
}