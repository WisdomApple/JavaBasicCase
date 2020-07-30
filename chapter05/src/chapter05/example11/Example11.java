package chapter05.example11;

/**
 * 数组元素的拷贝
 */
public class Example11 {
    public static void main(String[] args) {
        int[] fromArray = {101, 102, 103, 104, 105, 106}; // 源数组
        int[] toArray = {201, 202, 203, 204, 205, 206, 207}; // 目标数组
        System.arraycopy(fromArray, 2, toArray, 3, 4); // 拷贝数组元素
        // 打印目标数组中的元素
        for (int i = 0; i < toArray.length; i++) {
            System.out.println(i + ": " + toArray[i]);
        }
    }
}