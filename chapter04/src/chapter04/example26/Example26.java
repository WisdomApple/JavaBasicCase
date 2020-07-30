package chapter04.example26;

public class Example26 {
    public static void main(String[] args) {
        int result = divide(4, -2); // 调用divide()方法，传入一个负数作为被除数
        System.out.println(result);
    }

    // 下面的方法实现了两个整数相除，
    public static int divide(int x, int y) {
        if (y < 0) {
            // throw new DivideByMinusException("除数是负数");// 使用throw关键字声明异常对象
        }
        int result = x / y; // 定义一个变量result记录两个数相除的结果
        return result; // 将结果返回
    }
}
