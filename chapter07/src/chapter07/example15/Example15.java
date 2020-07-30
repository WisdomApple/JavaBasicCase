package chapter07.example15;

import java.io.File;

/**
 * 删除指定目录
 */
public class Example15 {
	public static void main(String[] args) {
		File file = new File("D:/test"); // 这是一个代表目录的File对象
		if (file.exists()) {
			System.out.println(file.delete() + "目标删除");
		} else {
			System.out.println("目标不在");
		}
	}
}