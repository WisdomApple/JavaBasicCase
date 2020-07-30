package chapter02.task01;

public class StoreList {
    public static void main(String[] args) {

        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        String macConfig = "  处理器Inter Core 2 Duo\n" +
				"  内存2G\n" +
				"  存储器120GB HDD";
        int macCount = 5;

        String thinkpadBrand = "ThinkpadT450";
        double thinkpadSize = 14.0;
        double thinkpadPrice = 5999.99;
        String thinkpadConfig = "  处理器i7 5500U(\n" +
				"  内存8G\n" +
				"  存储器500GB HDD";
        int thinkpadCount = 10;

        String ASUSBrand = "ASUS-FL5800";
        double ASUSSize = 15.6;
        double ASUSPrice = 4999.50;
        String ASUSConfig = "  处理器i7 5500U(\n" +
				"  内存4G\n" +
				"  存储器128GB SSD";
        int ASUSCount = 18;

        System.out.println("------------------------------"
                + "-----------------------------");
        System.out.println("商品详情：");

        System.out.println(macBrand + "\n尺寸：" + macSize + "\n价格：" + macPrice + "\n配置信息：\n"
                + macConfig + "\n库存：" + macCount);
        System.out.println(thinkpadBrand + "\n尺寸：" + thinkpadSize + "\n价格："
                + thinkpadPrice + "\n配置信息：\n" + thinkpadConfig + "\n库存：" + thinkpadCount);
        System.out.println(ASUSBrand + "\n尺寸：" + ASUSSize + "\n价格：" + ASUSPrice + "\n配置信息：\n"
                + ASUSConfig + "\n库存：" + ASUSCount);

        int totalCount = macCount + thinkpadCount + ASUSCount;
        double totalMoney = (macCount * macPrice)
                + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);

        System.out.println("--------------------"
                + "-----------------------------------------------");
        System.out.println("商品总数目：" + totalCount);
        System.out.println("商品总价格：" + totalMoney);

    }
}