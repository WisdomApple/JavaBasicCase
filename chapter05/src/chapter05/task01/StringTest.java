package chapter05.task01;

import org.jetbrains.annotations.NotNull;

public class StringTest {
    public static void main(String[] args) {
        String str = "nbaernbatnbaynbauinbaopnba";// 整串
        String key = "nba";// 子串
        int count = getKeyStringCount(str, key);
        System.out.println("count = " + count);
    }

    /**
     * 获取子串在整串中出现的次数
     */
    public static int getKeyStringCount(@NotNull String str, String key) {
        // 定义计数器,记录出现的次数
        int count = 0;
        // 如果整串中不包含子串，则直接返回count
        if (!str.contains(key)) {
            return count;
        }
        // 定义变量记录key出现的位置
        int index = 0;
        while ((index = str.indexOf(key)) != -1) {
            str = str.substring(index + key.length());
            count++;
        }
        return count;
    }
}