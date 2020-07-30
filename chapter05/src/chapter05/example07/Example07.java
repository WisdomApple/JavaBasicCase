package chapter05.example07;

/**
 * 字符串角标越界异常
 */
public class Example07 {
    public static void main(String[] args) {
        String s = "abcdedcba";
        System.out.println(s.charAt(10));
    }
}