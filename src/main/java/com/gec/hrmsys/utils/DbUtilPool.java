package com.gec.hrmsys.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtilPool {
    private static Properties props = new Properties();
    private static DataSource dataSource;
    static {

        try {
            props.load(DbUtilPool.class.getClassLoader().getResourceAsStream("druid.properties"));
             dataSource = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取连接方法
    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  conn;
    }


    //关闭资源方法
    public static void close(ResultSet rs, Statement st , Connection conn){
        try {
            if(rs!=null){
                rs.close();
            }
            if(st!=null){
                st.close();//druid重写后的关闭连接方法,将连接还给连接池
            }
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(DbUtilPool.getConnection());
    }

}
