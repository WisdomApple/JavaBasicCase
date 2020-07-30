package chapter05.example12;

/**
 * Runtime类的使用
 */
public class Example12 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime(); // 获取
        System.out.println("处理器的个数: " + rt.availableProcessors() + "个");
        System.out.println("空闲内存数量: " + rt.freeMemory() / 1024 / 1024 + "M");
        System.out.println("最大可用内存数量: " + rt.maxMemory() / 1024 / 1024 + "M");
    }
}