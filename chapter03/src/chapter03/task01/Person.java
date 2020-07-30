package chapter03.task01;

public class Person {        // 人
    private String name;    // 人名

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Product shopping(Market market, String name) {        // 购物, 指定去哪个超市, 商品名
        return market.sell(name);                        // 调用超市的卖货方法, 指定商品名, 把卖出的结果返回
    }
}
