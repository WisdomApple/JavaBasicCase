package chapter03.example04;

public class Example04 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(-30);
		stu.setName("韩强");
		stu.introduce();
	}
}

/**
 * 实现类的封装
 */
class Student {
    private String name; // 将name属性私有化
    private int age; // 将age属性私有化

    // 下面是公有的 getXxx 和 setXxx 方法
    public String getName() {
        return name;
    }

    public void setName(String stuName) {
        name = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int stuAge) {
        // 下面是对传入的参数进行检查
        if (stuAge <= 0) {
            System.out.println("对不起，您输入的年龄不合法...");
        } else {
            age = stuAge; // 对属性赋值
        }
    }

    public void introduce() {
        System.out.println("大家好，我叫" + name + "，我今年" + age + "岁!");
    }
}

