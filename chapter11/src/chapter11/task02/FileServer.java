package chapter11.task02;

import java.io.*;
import java.net.*;

/**
 * 文件服务器
 */
public class FileServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(10001); // 创建ServerSocket对象
        while (true) {
            // 调用accept()方法接收客户端请求，得到Socket对象
            Socket s = serverSocket.accept();
            // 每当和客户端建立Socket连接后，单独开启一个线程处理和客户端的交互
            new Thread(new ServerThread(s)).start();
        }
    }
}

class ServerThread implements Runnable {
    private Socket socket; // 持有一个Socket类型的属性

    public ServerThread(Socket socket) { // 构造方法中把Socket对象作为实参传入
        this.socket = socket;
    }

    public void run() {
        String ip = socket.getInetAddress().getHostAddress(); // 获取客户端的IP地址
        int count = 1; // 上传图片个数
        try {
            InputStream in = socket.getInputStream();
            File parentFile = new File("server.txt"); // 创建上传图片目录的File对象
            if (!parentFile.exists()) { // 如果不存在，就创建这个目录
                parentFile.mkdir();
            }
            // 把客户端的IP地址作为上传文件的文件名
            File file = new File(parentFile, ip + "(" + count + ").txt");
            while (file.exists()) {
                // 如果文件名存在，则把count++
                file = new File(parentFile, ip + "(" + (count++) + ").txt");
            }
            // 创建FileOutputStream对象
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buf = new byte[1024]; // 定义一个字节数组
            int len = 0; // 定义一个int类型的变量len，初始值为0
            while ((len = in.read(buf)) != -1) { // 循环读取数据
                fos.write(buf, 0, len);
            }
            OutputStream out = socket.getOutputStream();// 获取服务端的输出流
            out.write("上传成功".getBytes()); // 上传成功后向客户端写出“上传成功”
            fos.close(); // 关闭输出流对象
            socket.close(); // 关闭Socket对象
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
