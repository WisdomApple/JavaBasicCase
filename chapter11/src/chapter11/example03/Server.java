package chapter11.example03;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        new TCPServer().listen(); // 创建TCPServer对象，并调用listen()方法
    }
}

// TCP服务端
class TCPServer {
    private static final int PORT = 7788; // 定义一个端口号

    public void listen() throws Exception { // 定义一个listen()方法，抛出一个异常
        ServerSocket serverSocket = new ServerSocket(PORT); // 创建ServerSocket对象
        Socket client = serverSocket.accept(); // 调用ServerSocket的accept()方法接收数据
        OutputStream os = client.getOutputStream();// 获取客户端的输出流
        System.out.println("开始与客户端交互数据");
        os.write(("GitHub欢迎你！").getBytes()); // 当客户端连接到服务端时，向客户端输出数据
        Thread.sleep(5000); // 模拟执行其他功能占用的时间
        System.out.println("结束与客户端交互数据");
        os.close();
        client.close();
    }
}
