package chapter05.example01;

/**
 * String类构造方法的使用
 */
public class Example01 {
    public static void main(String[] args) throws Exception {
        // 创建一个空的字符串
        String str1 = new String();
        // 创建一个内容为"abcd"的字符串
        String str2 = new String("abcd");
        // 创建一个内容为字符数组的字符串
        char[] charArray = new char[]{'D', 'E', 'F'};
        String str3 = new String(charArray);
        System.out.println("a" + str1 + "b");
        System.out.println(str2);
        System.out.println(str3);
    }
}
