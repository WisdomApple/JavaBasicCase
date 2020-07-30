package chapter06.task02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

/**
 * 校验信息
 */
public class CheckInfo {
    public static HashSet<User> USER_DATA = new HashSet<User>(); // 用户数据

    public CheckInfo(HashSet<User> USER_DATA) {
        this.USER_DATA = USER_DATA;
    }

    // 校验用户信息,返回登录状态信息
    public String checkAction(String userName, String password, String rePassword,
                              String birthday, String phone, String email) {
        StringBuilder result = new StringBuilder();
        // 1代表成功 2代表失败
        int state = 1;
        // 密码判断
        if (!password.equals(rePassword)) {// 判断密码和重复密码是否相同
            result.append("两次输入密码不一致!\r\n");
            state = 2;
        }
        // 生日判断
        if (birthday.length() != 10) {// 字符串长度不为10，则认为格式错误
            result.append("生日格式不正确!\r\n");
            state = 2;
        } else {
            for (int i = 0; i < birthday.length(); i++) {
                Character thisChar = birthday.charAt(i);
                if (i == 4 || i == 7) {
                    if (!(thisChar == '-')) {// 验证第4位和第7位是否是符号“-”
                        result.append("生日格式不正确!\r\n");
                        state = 2;
                    }
                } else {// 验证除了第4位和第7位的字符是否是0~9的数字
                    if (!(Character.isDigit(thisChar))) {
                        result.append("生日格式不正确!\r\n");
                        state = 2;
                    }
                }
            }
        }
        // 手机号判断
        if (phone.length() != 11) {// 判断手机号长度不等于11位则认为此手机号无效
            result.append("手机号码不正确!\r\n");
            state = 2;
            // 默认有效手机号为13、15、17和18开头的手机号
        } else if (!(phone.startsWith("13") || phone.startsWith("15")
                || phone.startsWith("17") || phone.startsWith("18"))) {
            result.append("手机号码不正确!\r\n");
            state = 2;
        }
        // 邮箱判断
        if (!email.contains("@")) {// 判断邮箱地址，默认不带@符号的邮箱为无效邮箱
            result.append("邮箱不正确!\r\n");
            state = 2;
        }
        // 如果以上信息校验无误，则将新用户加入到集合
        if (state == 1) {
            // 格式化日期返回Date对象
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");// 定义日期格式
            Date dateBirthday = null;

            try {
                dateBirthday = format.parse(birthday);// 将生日格式化成日期格式
            } catch (ParseException e) {
                e.printStackTrace();
            }
            User newUser = new User(userName, rePassword, dateBirthday, phone, email);
            // 将用户添加到列表中，同时可根据HashSet判断出用户名有没有重复
            if (!USER_DATA.add(newUser)) {
                result.append("用户重复!");
                state = 2;
            }
            if (state == 1) {
                result.append("注册成功!");
            }
        }
        return result.toString();
    }
}