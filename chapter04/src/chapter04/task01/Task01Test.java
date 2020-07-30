package chapter04.task01;

//测试类
class Task01Test {
    public static void main(String[] args) {
        //实例化电脑对象
        Computer c = new Computer();
        // 向电脑中添加鼠标、麦克风和键盘设备
        c.add(new Mouse());
        c.add(new Mic());
        c.add(new KeyBoard());
        c.powerOn();//启动电脑
        System.out.println();
        c.powerOff();//关闭电脑
    }
}



