package chapter04.task02;

/*
 * 定义测试类
 */
public class Task02Test {
    public static void main(String[] args) {
        // 快递任务类对象
        SendTask task = new SendTask("HYX600235", 76.34);
        // 调用送前准备方法
        task.sendBefore();
        System.out.println("======================");
        // 创建交通工具对象
        ZTransportation t = new ZTransportation("Z025", "大奔", "小韩");
        //创建GPS工具对象
        Phone p = new Phone();
        // 将交通工具与GPS工具传入送货方法
        task.send(t, p);
        System.out.println("======================");
        // 调用送后操作方法
        task.sendAfter(t);
        t.upKeep();
    }
}
