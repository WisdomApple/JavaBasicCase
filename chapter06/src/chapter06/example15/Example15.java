package chapter06.example15;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Prorperties集合的使用
 */
public class Example15 {
    public static void main(String[] args) {
        Properties p = new Properties();             // 创建Properties对象
        p.setProperty("Backgroud-color", "red");
        p.setProperty("Font-size", "14px");
        p.setProperty("Language", "chinese");
        Enumeration names = p.propertyNames();     // 获取Enumeration对象所有键的枚举
        while (names.hasMoreElements()) {            // 循环遍历所有的键
            String key = (String) names.nextElement();
            String value = p.getProperty(key);       // 获取对应键的值
            System.out.println(key + " = " + value);
        }
    }
}