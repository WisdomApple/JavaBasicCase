package chapter07.example06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * BufferedInputStream和BufferedOutputStream 这两个流的用法
 */

public class Example06 {
    public static void main(String[] args) throws Exception {
        // 创建一个带缓冲区的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "src.txt"));
        // 创建一个带缓冲区的输出流
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("des.txt"));
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}