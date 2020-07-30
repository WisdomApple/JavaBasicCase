package chapter05.task02;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * 字符串排序程序
 */
public class WrapperTest {
    private static final String SPACE_SEPARATOR = " ";

    public static void main(String[] args) {
        String numStr = "20 78 9 -7 88 36 29";
        System.out.println(numStr);
        numStr = sortStringNumber(numStr);
        System.out.println(numStr.toString());
    }

    @NotNull
	public static String sortStringNumber(String numStr) {
        // 1,将字符串变成字符串数组
        String[] str_arr = stringToArray(numStr);
        // 2,将字符串数组变成int数组
        int[] num_arr = toIntArray(str_arr);
        // 3,对int数组排序
        mySortArray(num_arr);
        // 4,将排序后的int数组变成字符串
        String temp = arrayToString(num_arr);
        return temp;
    }

    @NotNull
	public static String arrayToString(@NotNull int[] num_arr) {
        StringBuffer sb = new StringBuffer();
        for (int x = 0; x < num_arr.length; x++) {
            if (x != num_arr.length - 1)
                sb.append(num_arr[x] + SPACE_SEPARATOR);
            else
                sb.append(num_arr[x]);
        }
        return sb.toString();
    }

    public static void mySortArray(int[] num_arr) {
        Arrays.sort(num_arr);
    }

    @NotNull
	public static int[] toIntArray(@NotNull String[] str_arr) {
        int[] arr = new int[str_arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str_arr[i]);
        }
        return arr;
    }

    @NotNull
	@Contract(pure = true)
	public static String[] stringToArray(@NotNull String numStr) {
        String[] str_arr = numStr.split(SPACE_SEPARATOR);
        return str_arr;
    }
}

