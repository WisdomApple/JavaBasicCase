package chapter04.task01;

//电脑
public class Computer {
    // 电脑上的USB插槽
    private USB[] usbArr = new USB[4];

    // 向电脑上连接一个USB设备
    public void add(USB usb) {
        // 循环遍历所有插槽
        for (int i = 0; i < usbArr.length; i++) {
            // 如果发现一个空的
            if (usbArr[i] == null) {
                // 将usb设备连接在这个插槽上
                usbArr[i] = usb;
                // 连接上之后结束循环
                break;
            }
        }
    }

    // 电脑的开机功能
    public void powerOn() {
        // 循环遍历所有插槽
        for (int i = 0; i < usbArr.length; i++) {
            // 如果发现有设备
            if (usbArr[i] != null) {
                // 将USB设备启动
                usbArr[i].turnOn();
            }
        }
        System.out.println("电脑开机成功");
    }

    //电脑关机功能
    public void powerOff() {
        for (int i = 0; i < usbArr.length; i++) {
            if (usbArr[i] != null) {
                usbArr[i].turnOff();
            }
        }
        System.out.println("电脑关机成功");
    }
}
