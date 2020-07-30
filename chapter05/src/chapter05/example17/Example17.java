package chapter05.example17;

import java.util.Random;

/**
 * 使用构造方法Random(long seed)产生随机数
 */
public class Example17 {
    public static void main(String args[]) {
        Random r = new Random(13); // 创建对象时传入种子
        // 随机产生10个[0,100)之间的整数
        for (int x = 0; x < 10; x++) {
            System.out.println(r.nextInt(100));
        }
    }
}