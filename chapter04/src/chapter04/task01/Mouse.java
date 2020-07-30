package chapter04.task01;

// 鼠标
public class Mouse implements USB {
    public void turnOn() {
        System.out.println("鼠标启动了");
    }

    public void turnOff() {
        System.out.println("鼠标关闭了");
    }
}
