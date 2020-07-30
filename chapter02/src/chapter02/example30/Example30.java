package chapter02.example30;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Example30 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 3, 9, 8};
        int max = getMax(arr);
        System.out.println("max=" + max);
    }

    @Contract(pure = true)
    static int getMax(@NotNull int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}