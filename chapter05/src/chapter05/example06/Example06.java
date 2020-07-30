package chapter05.example06;

/**
 * 字符串的截取和分割操作
 */
public class Example06 {
    public static void main(String[] args) {
        String str = "那年-那兔-那些事";
        // 下面是字符串截取操作
        System.out.println("从第4个字符截取到末尾的结果：" + str.substring(3));
        System.out.println("从第7个字符截取到第9个字符的结果：" + str.substring(6, 8));
        // 下面是字符串分割操作
        System.out.print("分割后的字符串数组中的元素依次为：");
        String[] strArray = str.split("-"); // 将字符串转换为字符串数组
        for (int i = 0; i < strArray.length; i++) {
            if (i != strArray.length - 1) {
                // 如果不是数组的最后一个元素,在元素后面加逗号
                System.out.print(strArray[i] + "，");
            } else {
                // 数组的最后一个元素后面不加逗号
                System.out.println(strArray[i]);
            }
        }
    }
}