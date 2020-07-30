package chapter06.task02;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 用户注册
 */
public class UserRegister {
    public static HashSet<User> USER_DATA = new HashSet<User>(); // 用户数据

    public static void main(String[] args) {
        initData();// 初始化人员信息
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String userName = scan.nextLine();// 获取用户名
        System.out.print("请输入密码：");
        String password = scan.nextLine();// 获取密码
        System.out.print("请重复密码：");
        String repassword = scan.nextLine();// 获取重复密码
        System.out.print("出生日期：");
        String birthday = scan.nextLine();// 获取出生日期
        System.out.print("手机号码：");
        String telNumber = scan.nextLine();// 获取手机号码
        System.out.print("电子邮箱：");
        String email = scan.nextLine();// 获取电子邮箱
        // 校验用户信息,返回登录状态信息
        CheckInfo checkInfo = new CheckInfo(USER_DATA);
        String result = checkInfo.checkAction(userName, password, repassword,
                birthday, telNumber, email);
        System.out.println("注册结果：" + result);
    }

    // 初始化数据，创建两个已存在的用户信息
    private static void initData() {
        User user = new User("张正", "zz,123", new Date(),
                "18810319240", "zhangzheng@itcast.cn");
        User user2 = new User("周琦", "zq,123", new Date(),
                "18618121193", "zhouqi@itcast.cn");
        USER_DATA.add(user);
        USER_DATA.add(user2);
    }
}