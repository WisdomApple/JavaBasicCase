package chapter04.task02;

/*
 * 随意定义一个物品，实现GPS接口，拥有定位功能。
 */
class Phone implements GPS {
    public Phone() { //空参构造
        super();
    }

    //定位方法
    public String showCoordinate() {
        String location = "193,485";
        return location;
    }
}
