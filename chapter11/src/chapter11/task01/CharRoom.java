package chapter11.task01;

import java.util.Scanner;

/**
 * 聊天室
 */
public class CharRoom {
    public static void main(String[] args) {
        System.out.println("欢迎您进入聊天室!");
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入本程序发送端端口号：");
        int sendPort = sc.nextInt();
        System.out.print("请输入本程序接收端端口号：");
        int receivePort = sc.nextInt();
        System.out.println("聊天系统启动！！");
        new Thread(new SendTask(sendPort), "发送端任务").start(); //发送操作
        new Thread(new ReceiveTask(receivePort), "接收端任务").start();//接收操作
    }
}