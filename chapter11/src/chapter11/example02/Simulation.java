package chapter11.example02;

import java.net.*;

/**
 * 运行此类后，再运行Receiver类，来模拟有另一个程序也同样占用端口号8954
 */
public class Simulation {
    public static void main(String[] args) throws Exception {
        byte[] buf = new byte[1024]; // 创建一个长度为1024的字节数组，用于接收数据
        // 定义一个DatagramSocket对象，监听的端口号为8954
        DatagramSocket ds = new DatagramSocket(8954);
        // 定义一个DatagramPacket对象，用于接收数据
        DatagramPacket dp = new DatagramPacket(buf, 1024);
        System.out.println("等待接收数据");
        ds.receive(dp); // 等待接收数据，如果没有数据则会阻塞
        // 调用DatagramPacket的方法获得接收到的信息，包括数据的内容、长度、发送的IP地址和端口号
        String str = new String(dp.getData(), 0, dp.getLength()) + "from "
                + dp.getAddress().getHostAddress() + ":" + dp.getPort();
        System.out.println(str); // 打印接收到的信息
        ds.close();// 释放资源
    }
}
