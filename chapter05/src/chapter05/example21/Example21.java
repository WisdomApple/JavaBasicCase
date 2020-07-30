package chapter05.example21;

/**
 * parseInt()方法的使用，在屏幕上打印*矩形
 */
public class Example21 {
    public static void main(String args[]) {
        int w = Integer.parseInt("20");
        int h = Integer.parseInt("10");
        for (int i = 0; i < h; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < w; j++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
    }
}
