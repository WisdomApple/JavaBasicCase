package chapter08.fruitstore.dao;

import chapter08.fruitstore.data.DataBase;
import chapter08.fruitstore.domain.FruitItem;

import java.util.ArrayList;

/*
 * 管理员数据访问类
 */
public class AdminDao {
    // 获取所有数据
    public ArrayList<FruitItem> queryAllData() {
        return DataBase.data;
    }

    // 添加数据
    public void addFruitItem(FruitItem fruitItem) {
        DataBase.data.add(fruitItem);
    }

    // 删除数据
    public void delFruitItem(String delNumber) {
        // 查询集合中数据
        for (int i = 0; i < DataBase.data.size(); i++) {
            FruitItem thisFruitItem = DataBase.data.get(i);
            // 如果有水果项的编号与传入编号相同，则从集合中删除
            if (thisFruitItem.getNumber().equals(delNumber)) {
                DataBase.data.remove(i);
            }
        }
    }
}
