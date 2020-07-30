package chapter02.example28;

public class Example28 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 5;
		System.out.println("arr[0] = " + arr[0]);
		arr = null;
		try {
			System.out.println("arr[0] = " + arr[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}