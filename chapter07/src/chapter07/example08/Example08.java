package chapter07.example08;

import java.io.FileWriter;

/**
 * 使用FileWriter将字符写入文件
 */
public class Example08 {
	public static void main(String[] args) throws Exception {
		// 创建一个FileWriter对象用于向文件中写入数据
		FileWriter writer = new FileWriter("writer.txt");
		String str = "请问，你是我的master吗？";
		writer.write(str); // 将字符数据写入到文本文件中
		writer.write("\r\n"); // 将输出语句换行
		writer.close(); // 关闭写入流，释放资源
	}
}