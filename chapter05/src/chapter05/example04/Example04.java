package chapter05.example04;

/**
 * replace()和trim()方法的使用
 */
public class Example04 {
    public static void main(String[] args) {
        String s = "I Like You";
        // 字符串替换操作
        System.out.println("将it替换成cn.it的结果:" + s.replace("Like", "Love"));
        // 字符串去除空格操作
        String s1 = "     I  L o v e  You     ";
        System.out.println("去除字符串两端空格后的结果:" + s1.trim());
        System.out.println("去除字符串中所有空格后的结果:" + s1.replace(" ", ""));
    }
}