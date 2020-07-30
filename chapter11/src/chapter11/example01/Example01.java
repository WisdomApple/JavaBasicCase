package chapter11.example01;

import java.net.InetAddress;

/*
 * InetAddress的常用方法
 */
public class Example01 {
    public static void main(String[] args) throws Exception {
        InetAddress localAddress = InetAddress.getLocalHost();
        InetAddress remoteAddress = InetAddress.getByName("github.com");
        System.out.println("本机的IP地址：" + localAddress.getHostAddress());
        System.out.println("github的IP地址：" + remoteAddress.getHostAddress());
        System.out.println("3秒是否可达：" + remoteAddress.isReachable(3000));
        System.out.println("github的主机名为：" + remoteAddress.getHostName());
    }
}