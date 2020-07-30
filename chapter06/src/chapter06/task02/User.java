package chapter06.task02;

import java.util.Date;

//用户信息
public class User {
    private String userName; // 用户名
    private String password; // 密码
    private Date birthday; // 生日
    private String telNumber; // 手机号码
    private String email; // 邮箱

    public User() {
    }

    public User(String userName, String password, Date birthday,
                String telNumber, String email) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.telNumber = telNumber;
        this.email = email;
    }

    // 重写hashCode与equals方法
    @Override
    public int hashCode() {// 重写hashCode方法，以用户名作为是否重复的依据
        return userName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {// 判断是否是同一个对象
            return true;// 如果是同一个对象，直接返回true
        }
        if (obj == null) {// 判断这个对象是否为空
            return false;// 如果对象是空的，直接返回false
        }
        if (getClass() != obj.getClass()) {// 判断这个对象是否是User类型
            return false;// 如果不是，直接返回false
        }
        User other = (User) obj;// 将对象强转为User类型
        if (userName == null) {// 判断集合中用户名是否为空
            if (other.userName != null) {// 判断对象中的用户名是否为空
                return false;// 如果集合中用户名为空并且对象中用户名不为空，则返回false
            }
        } else if (!userName.equals(other.userName)) {// 判断用户名是否相同
            return false;// 如果不同，返回false
        }
        return true;
    }
}