package chapter02.task03;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

public class CallName {
    public static void main(String[] args) {
        System.out.println("-------输入学生姓名---------");

        String[] students = new String[3];

        addStudentName(students);

        printStudentName(students);

        String randomName = randomStudentName(students);
        System.out.println("随机选取：" + randomName);
    }

    public static void addStudentName(@NotNull String[] students) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("输入第" + (i + 1) + "个学生姓名");
            students[i] = sc.next();
        }
    }

    public static void printStudentName(@NotNull String[] students) {

        for (int i = 0; i < students.length; i++) {
            String name = students[i];

            System.out.println("第" + (i + 1) + "个学生姓名：" + name);
        }
    }


    public static String randomStudentName(@NotNull String[] students) {

        int index = new Random().nextInt(students.length);

        String name = students[index];

        return name;
    }
}