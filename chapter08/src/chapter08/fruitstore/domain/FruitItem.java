package chapter08.fruitstore.domain;

/*
 * 水果项数据模型
 */
public class FruitItem {
    // 属性
    private String number;//编号
    private String name;  //名称
    private double price; //价格
    private String unit;  //单位

    //构造方法
    public FruitItem() {
    }

    public FruitItem(String number, String name, double price, String unit) {
        super();
        this.number = number;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    //get/set方法
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
