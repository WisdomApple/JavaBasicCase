package chapter03.example12;

public class Example12 {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 创建学生对象
		Student stu2 = new Student();
		Student.schoolName = "联邦大学"; // 为静态变量赋值
		System.out.println("我的学校是" + stu1.schoolName); // 打印第一个学生对象的学校
		System.out.println("我的学校是" + stu2.schoolName); // 打印第二个学生对象的学校
	}
}

/*
 * 静态变量
 */
class Student {
    static String schoolName; // 定义静态变量schoolName
}


