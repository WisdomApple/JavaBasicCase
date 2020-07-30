package chapter05.example05;

/**
 * 字符串判断方法
 */
public class Example05 {
    public static void main(String[] args) {
        String s1 = "Congratulation"; // 声明一个字符串
        String s2 = "Congratulate";
        System.out.println("判断是否以字符串 Con 开头：" + s1.startsWith("Con"));
        System.out.println("判断是否以字符串 tion 结尾：" + s1.endsWith("tion"));
        System.out.println("判断是否包含 gratu 字符串：" + s1.contains("gratu"));
        System.out.println("判断字符串是否为空：" + s1.isEmpty());
        System.out.println("判断两个字符串是否相等：" + s1.equals(s2));
    }
}
