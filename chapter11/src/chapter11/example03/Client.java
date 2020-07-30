package chapter11.example03;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        new TCPClient().connect(); // 创建TCPClient对象，并调用connect()方法
    }
}

// TCP客户端
class TCPClient {
    private static final int PORT = 7788; // 服务端的端口号

    public void connect() throws Exception {
        // 创建一个Socket并连接到给出地址和端口号的计算机
        Socket client = new Socket(InetAddress.getLocalHost(), PORT);
        InputStream is = client.getInputStream(); // 得到接收数据的流
        byte[] buf = new byte[1024]; // 定义1024个字节数组的缓冲区
        int len = is.read(buf); // 将数据读到缓冲区中
        System.out.println(new String(buf, 0, len)); // 将缓冲区中的数据输出
        client.close(); // 关闭Socket对象,释放资源
    }
}
