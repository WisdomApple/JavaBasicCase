package chapter02.example31;

import org.jetbrains.annotations.NotNull;

public class Example31 {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };
		System.out.print("     原数组排序：");
		printArray(arr);
		System.out.print("   排序从小到大：\n");
		bubbleSort(arr);
	}

	public static void printArray(@NotNull int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}


	public static void bubbleSort(@NotNull int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("第" + (i + 1) + "轮冒泡排序后：");
			printArray(arr);
		}
	}
}