package chapter02.example32;

public class Example32 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[]{11, 12};
        arr[1] = new int[]{21, 22, 23};
        arr[2] = new int[]{31, 32, 33, 34};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int groupSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                groupSum = groupSum + arr[i][j];
            }
            sum = sum + groupSum;
            System.out.println("arr第" + (i + 1) + "行数组元素之和：" + groupSum);
        }
        System.out.println("    arr所有元素之和：" + sum);
    }
}