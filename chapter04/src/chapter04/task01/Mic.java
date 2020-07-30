package chapter04.task01;

//麦克风
public class Mic implements USB {
    public void turnOn() {
        System.out.println("麦克风启动了");
    }

    public void turnOff() {
        System.out.println("麦克风关闭了");
    }
}
