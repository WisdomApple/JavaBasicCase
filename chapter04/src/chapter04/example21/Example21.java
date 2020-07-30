package chapter04.example21;

public class Example21 {
    public static void main(String[] args) {
        // 下面的代码定义了一个try…catch语句用于捕获异常
        try {
            int result = divide(4, 0); // 调用divide()方法
            System.out.println(result);
        } catch (Exception e) { // 对异常进行处理
            System.out.println("捕获的异常信息为：" + e.getMessage());
        }
        System.out.println("程序继续向下执行...");
    }

    // 下面的方法实现了两个整数相除
    public static int divide(int x, int y) {
        int result = x / y; // 定义一个变量result记录两个数相除的结果
        return result; // 将结果返回
    }
}
