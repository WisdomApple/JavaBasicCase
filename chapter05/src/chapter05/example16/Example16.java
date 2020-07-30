package chapter05.example16;

import java.util.Random;

/**
 * 使用构造方法Random()产生随机数
 */
public class Example16 {
    public static void main(String args[]) {
        Random r = new Random(); // 不传入种子
        // 随机产生10个[0,100)之间的整数
        for (int x = 0; x < 10; x++) {
            System.out.println(r.nextInt(100));
        }
    }
}