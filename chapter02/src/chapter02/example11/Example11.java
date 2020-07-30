package chapter02.example11;

public class Example11 {
	public static void main(String[] args) {
		int week = 2;
		switch (week) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("星期五");
			break;
		case 6:
		case 7:
			System.out.println("星期天");
			break;
		}
	}
}