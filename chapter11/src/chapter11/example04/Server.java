package chapter11.example04;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        new TCPServer().listen();   // 创建TCPServer对象，并调用listen()方法
    }
}

// TCP服务端
class TCPServer {
    private static final int PORT = 7788; // 定义一个静态常量作为端口号

    public void listen() throws Exception {
        // 创建ServerSocket对象，监听指定的端口
        ServerSocket serverSocket = new ServerSocket(PORT);
        // 使用while循环不停的接收客户端发送的请求
        while (true) {
            // 调用ServerSocket的accept()方法与客户端建立连接
            final Socket client = serverSocket.accept();
            // 下面的代码用来开启一个新的线程
            new Thread() {
                public void run() {
                    OutputStream os;  // 定义一个输出流对象
                    try {
                        os = client.getOutputStream();  // 获取客户端的输出流
                        System.out.println("开始与客户端交互数据");
                        os.write(("GitHub欢迎你！").getBytes());
                        Thread.sleep(5000);               // 使线程休眠5000毫秒
                        System.out.println("结束与客户端交互数据");
                        os.close();                        // 关闭输出流
                        client.close();                   // 关闭Socket对象
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                ;
            }.start();
        }
    }
}