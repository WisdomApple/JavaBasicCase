package chapter07.example10;

import java.io.*;

/**
 * 将字节流转为字符流
 */
public class Example10 {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("src.txt");// 创建字节输入流
        InputStreamReader isr = new InputStreamReader(in); // 将字节流输入转换成字符输入流
        BufferedReader br = new BufferedReader(isr); // 赋予字符流对象缓冲区
        FileOutputStream out = new FileOutputStream("des.txt");
        // 将字节输出流转换成字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(osw); // 赋予字符输出流对象缓冲区
        String line;
        while ((line = br.readLine()) != null) { // 判断是否读到文件末尾
            bw.write(line); // 输出读取到的文件
        }
        br.close();
        bw.close();
    }
}