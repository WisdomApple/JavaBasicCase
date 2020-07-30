package fruitstore.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import cn.itcast.fruitstore.data.DataBase;
import fruitstore.domain.FruitItem;
import fruitstore.tools.JDBCUtils;

/*
 * 管理员数据访问类
 */
public class AdminDao {
    /*
     *
    //获取所有数据
    public ArrayList<FruitItem> queryAllData() {
        return DataBase.data;
    }
    //添加数据
    public void addFruitItem(FruitItem fruitItem) {
        DataBase.data.add(fruitItem);
    }
    //删除数据
    public void delFruitItem(String delNumber) {
        //查询集合中数据
        for (int i = 0; i < DataBase.data.size(); i++) {
            FruitItem thisFruitItem = DataBase.data.get(i);
            //如果有水果项的编号与传入编号相同，则从集合中删除
            if(thisFruitItem.getNumber().equals(delNumber)) {
                DataBase.data.remove(i);
            }
        }
    }
  */
//------为了方便读者学习，以上为原来使用集合模拟数据库的方法，以下为连接MySQL数据库后的方法--------------------------------------------	
    // 获取所有数据
    public ArrayList<FruitItem> queryAllData() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<FruitItem> list = new ArrayList<FruitItem>();
        try {
            // 获得数据的连接
            conn = JDBCUtils.getConnection();
            // 获得Statement对象
            stmt = conn.createStatement();
            // 发送SQL语句
            String sql = "SELECT * FROM fruit";
            rs = stmt.executeQuery(sql);
            // 处理结果集
            while (rs.next()) {
                FruitItem fruitItem = new FruitItem();
                fruitItem.setNumber(rs.getString("number"));
                fruitItem.setName(rs.getString("fruitname"));
                fruitItem.setPrice(rs.getDouble("price"));
                fruitItem.setUnit(rs.getString("unit"));
                list.add(fruitItem);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
        return null;
    }

    //添加数据
    public void addFruitItem(FruitItem fruitItem) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 获得数据的连接
            conn = JDBCUtils.getConnection();
            // 获得Statement对象
            stmt = conn.createStatement();
            // 发送SQL语句
            String sql = "INSERT INTO fruit(number,fruitname,price,unit)"
                    + "VALUES(" + fruitItem.getNumber() + ",'" + fruitItem.getName()
                    + "','" + fruitItem.getPrice() + "','" + fruitItem.getUnit() + "')";
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                System.out.println("插入数据成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
    }

    //删除数据
    public void delFruitItem(String delNumber) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 获得数据的连接
            conn = JDBCUtils.getConnection();
            // 获得Statement对象
            stmt = conn.createStatement();
            // 发送SQL语句
            String sql = "DELETE FROM fruit WHERE number=" + delNumber;
            int num = stmt.executeUpdate(sql);
            if (num > 0) {
                System.out.println("删除数据成功！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(rs, stmt, conn);
        }
    }
}
