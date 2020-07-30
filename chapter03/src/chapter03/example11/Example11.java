package chapter03.example11;

public class Example11 {
	public static void main(String[] args) {
		// 下面是创建了两个Person对象
		Person p1 = new Person();
		Person p2 = new Person();
		// 下面将变量置为null，让对象成为垃圾
		p1 = null;
		p2 = null;
		// 调用方法进行垃圾回收
		System.gc();
		for (int i = 0; i < 1000000; i++) {
			// 为了延长程序运行的时间
		}
	}
}

/**
 * 垃圾回收
 */
class Person {
    // 下面定义的finalize方法会在垃圾回收前被调用
    public void finalize() {
        System.out.println("对象将被作为垃圾回收...");
    }
}

