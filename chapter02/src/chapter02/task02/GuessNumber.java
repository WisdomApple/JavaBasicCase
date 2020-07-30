package chapter02.task02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(10);
        System.out.println("");

        System.out.println("----请输入一个10以内的整数----");
        Scanner sc = new Scanner(System.in);
		int enterNumber = 0;

		while (enterNumber != randomNumber) {

            if (enterNumber > randomNumber) {
                System.out.println("sorry，数字大了!");
            } else {
                System.out.println("sorry，数字小了!");
            }

            System.out.println("--------");
            enterNumber = sc.nextInt();
        }
        System.out.println("Done！");
    }
}