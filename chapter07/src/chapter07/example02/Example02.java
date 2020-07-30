package chapter07.example02;

import java.io.FileOutputStream;

/**
 * 使用FileOutputStream将数据写入文件
 */
public class Example02 {
    public static void main(String[] args) throws Exception {
        // 创建一个文件字节输出流
        FileOutputStream out = new FileOutputStream("./target/example.txt");
        String str = "我喜欢你的每一分，每一秒";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();
    }
}