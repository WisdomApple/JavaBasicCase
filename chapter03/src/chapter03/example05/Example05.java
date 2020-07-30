package chapter03.example05;

public class Example05 {
	public static void main(String[] args) {
		Person p = new Person(); // 实例化 Person对象
	}
}

/**
 * 构造方法的定义
 */
class Person {
	// 下面是类的构造方法
	public Person() {
		System.out.println("无参的构造方法被调用了...");
	}
}