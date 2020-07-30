package chapter11.example02;

import java.net.*;

/**
 * 发送端
 */
public class Sender {
    public static void main(String[] args) throws Exception {
        // 创建一个DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(3000);
        String str = "hello world"; // 要发送的数据
        byte[] arr = str.getBytes();        // 将定义的字符串转为字节数组
        /*
         * 创建一个要发送的数据包，数据包包括发送的数据，数据的长度，接收端的IP地址以及端口号
         */
        DatagramPacket dp = new DatagramPacket(arr, arr.length,
                InetAddress.getByName("localhost"), 8954);
        System.out.println("发送信息");
        ds.send(dp); // 发送数据
        ds.close(); // 释放资源
    }
}