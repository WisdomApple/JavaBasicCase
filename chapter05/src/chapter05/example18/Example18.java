package chapter05.example18;

import java.util.Random;

/**
 * Random类中的常用方法
 */
public class Example18 {
    public static void main(String[] args) {
        Random r1 = new Random(); // 创建Random实例对象
        System.out.println("产生float类型随机数: " + r1.nextFloat());
        System.out.println("产生0~100之间int类型的随机数:" + r1.nextInt(100));
        System.out.println("产生double类型的随机数:" + r1.nextDouble());
    }
}
