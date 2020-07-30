package chapter05.example10;

/**
 * 计算程序在进行求和操作时所消耗的时间
 */
public class Example10 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();// 循环开始时的当前时间
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();// 循环结束后的当前时间
        System.out.println("程序运行的时间为：" + (endTime - startTime) + "毫秒");
    }
}