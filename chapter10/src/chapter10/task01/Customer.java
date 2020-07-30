package chapter10.task01;
/**
 * 储户类
 */
public class Customer implements Runnable{
	private Bank b = new Bank();
	public void run() {
		for(int i=0; i<3; i++) {
				b.add(100);
		}
	}
}