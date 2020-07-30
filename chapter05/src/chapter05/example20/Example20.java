package chapter05.example20;

/**
 * 拆箱操作
 * intValue()方法的使用
 */
public class Example20 {
    public static void main(String args[]) {
        Integer num = new Integer(20);
        int a = 10;
        int sum = num.intValue() + a;
        System.out.println("sum = " + sum);
    }
}