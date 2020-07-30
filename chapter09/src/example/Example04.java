package example;

import java.sql.*;

public class Example04 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:src/test1.db";
            //1.获取Connection对象
            conn = DriverManager.getConnection(url);
            String sql = "select * from users";
            //2.创建Statement对象并设置常量
            Statement st = conn.createStatement(
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_READ_ONLY);
            //3.执行SQL并将获取的数据信息存放在ResultSet中
            ResultSet rs = st.executeQuery(sql);
            //4.取出ResultSet中指定数据的信息
            System.out.print("第1条数据的name值为：");
            rs.next();        //将指针定位到结果集中第2行数据
            System.out.println(rs.getString("name"));
            System.out.print("第2条数据的name值为：");
            rs.next();              //将指针向后滚动
            System.out.println(rs.getString("name"));
            System.out.print("第3条数据的name值为：");
            rs.next();
            System.out.println(rs.getString("name"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally { // 释放资源
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                stmt = null;
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}