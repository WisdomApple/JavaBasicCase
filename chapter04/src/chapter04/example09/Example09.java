package chapter04.example09;

// 定义测试类
public class Example09 {
    public static void main(String[] args) {
        Student stu = new Student(); // 创建Student类的实例对象
        stu.introduce(); // 调用Student的introduce()方法
    }
}

// 定义Student类
class Student {
    //final String name; // 使用final关键字修饰name属性
    final String name = "韩强"; // 为成员变量赋予初始值

    // 定义introduce()方法，打印学生信息
    public void introduce() {
        System.out.println("我叫" + name + "，是传智播客的学生");
    }
}
