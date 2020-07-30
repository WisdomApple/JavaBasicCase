package chapter04.example27;

// 下面的代码是自定义一个异常类继承自Exception
public class DivideByMinusException extends Exception {
	public DivideByMinusException() {
		super(); // 调用Exception无参的构造方法
	}

	public DivideByMinusException(String message) {
		super(message); // 调用Exception有参的构造方法
	}
}
