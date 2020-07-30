package chapter07.example03;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 使用FileOutputStream将数据追加到文件末尾
 */
public class Example03 {
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("./target/example.txt", true);
		String str = "\n最美的是你的名字";
		byte[] b = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			out.write(b[i]);
		}
		out.close();
	}
}