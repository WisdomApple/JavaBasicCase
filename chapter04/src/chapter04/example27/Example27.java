package chapter04.example27;

public class Example27 {
    public static void main(String[] args) {
        // 下面的代码定义了一个try…catch语句用于捕获异常
        try {
            int result = divide(4, -2); // 调用divide()方法，传入一个负数作为被除数
            System.out.println(result);
        } catch (DivideByMinusException e) { // 对捕获到的异常进行处理
            System.out.println(e.getMessage()); // 打印捕获的异常信息
        }
    }

    // 下面的方法实现了两个整数相除，并使用throws关键字声明抛出自定义异常
    public static int divide(int x, int y) throws DivideByMinusException {
        if (y < 0) {
            throw new DivideByMinusException("除数是负数");// 使用throw关键字声明异常对象
        }
        int result = x / y; // 定义一个变量result记录两个数相除的结果
        return result; // 将结果返回
    }
}
