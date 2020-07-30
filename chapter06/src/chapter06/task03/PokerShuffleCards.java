package chapter06.task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerShuffleCards {
    public static void main(String[] args) {
        // 准备花色
        ArrayList<String> color = new ArrayList<String>();

        color.add("♠");
        color.add("♥");
        color.add("♦");
        color.add("♣");

        // 准备数字 ,用ArrayList将纸牌由小到大排序
        ArrayList<String> number = new ArrayList<String>();
        for (int i = 3; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        number.add("2");
        // 定义一个map集合：用来将数字与每一张牌进行对应
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        int index = 0;// 纸牌编号
        for (String thisNumber : number) {// 循环纸牌数字
            for (String thisColor : color) {// 循环纸牌花色
                // 将花色与数字组合，形成52张牌，并赋予其编号
                map.put(index++, thisColor + thisNumber);
            }
        }
        // 加入大小王
        map.put(index++, "小☺");
        map.put(index++, "大☻");
        // 一副54张的牌 ArrayList里边为0-53的数的新牌
        ArrayList<Integer> cards = new ArrayList<Integer>();
        for (int i = 0; i <= 53; i++) {
            cards.add(i);// 此时的cards顺序为0-53
        }
        // 洗牌，使用Collections工具类中的shuffle()方法
        Collections.shuffle(cards);// 此时的cards顺序已被打乱
        // 创建三个玩家和底牌
        ArrayList<Integer> iPlayer = new ArrayList<Integer>();
        ArrayList<Integer> iPlayer2 = new ArrayList<Integer>();
        ArrayList<Integer> iPlayer3 = new ArrayList<Integer>();
        ArrayList<Integer> iSecretCards = new ArrayList<Integer>();
        // 遍历这副洗好的牌，遍历过程中，将牌发到三个玩家和底牌中
        for (int i = 0; i < cards.size(); i++) {
            if (i >= 51) {
                iSecretCards.add(cards.get(i));// 留取3张底牌
            } else {
                if (i % 3 == 0) {
                    iPlayer.add(cards.get(i));// 与3取余为0的牌发给玩家1
                } else if (i % 3 == 1) {
                    iPlayer2.add(cards.get(i));// 与3取余为1的牌发给玩家2
                } else {
                    iPlayer3.add(cards.get(i));// 其余的牌发给玩家3
                }
            }
        }
        // 对每个人手中的牌排序，使用Collections工具类中的sort()方法
        Collections.sort(iPlayer);
        Collections.sort(iPlayer2);
        Collections.sort(iPlayer3);
        // 对应数字形式的每个人手中的牌，定义字符串形式的牌
        ArrayList<String> sPlayer = new ArrayList<String>();
        ArrayList<String> sPlayer2 = new ArrayList<String>();
        ArrayList<String> sPlayer3 = new ArrayList<String>();
        ArrayList<String> sSecretCards = new ArrayList<String>();
        // 循环主键，从map中获取纸牌
        for (Integer key : iPlayer) {
            sPlayer.add(map.get(key));
        }
        for (Integer key : iPlayer2) {
            sPlayer2.add(map.get(key));
        }
        for (Integer key : iPlayer3) {
            sPlayer3.add(map.get(key));
        }
        for (Integer key : iSecretCards) {
            sSecretCards.add(map.get(key));
        }
        // 看牌
        System.out.println("玩家1：" + sPlayer);
        System.out.println("玩家2：" + sPlayer2);
        System.out.println("玩家3：" + sPlayer3);
        System.out.println("底牌：" + sSecretCards);
    }
}
