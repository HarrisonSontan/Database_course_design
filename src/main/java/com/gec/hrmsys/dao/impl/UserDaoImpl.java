package com.gec.hrmsys.dao.impl;

import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.domain.User;
import com.gec.hrmsys.dao.UserDao;
import com.gec.hrmsys.utils.DbUtilPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cr
 * @date 2023年12月11日 20:52
 * @description  用户数据访问层实现类
 *
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<User> queryAll() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        //1.声明 执行的sql语句
        String sql = "select * from user_inf";
        //2.创建返回的集合对象

        List<User> list = new ArrayList<>();
        //3.获取连接 执行sql
        try {
            conn = DbUtilPool.getConnection();
            pstm= conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setUsername(rs.getString("username"));
                user.setLoginname(rs.getString("loginname"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setStatus(rs.getInt("STATUS"));
                user.setCreateDate(rs.getTimestamp("createdate"));
                list.add(user);
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbUtilPool.close(rs,pstm,conn);
        }

        return null;
    }


    @Override
    public int queryUserCount(User user) {

        String sql = "select count(*) from user_inf where 1=1 ";
        if(user.getLoginname()!=null&&!"".equals(user.getLoginname())){
            sql+="and loginname like '%" +user.getLoginname() +"%' ";
        }
        if(user.getUsername()!=null&&!"".equals(user.getUsername())){
            sql+="and username like '%" +user.getUsername() +"%' ";
        }
        if(user.getStatus()!=null&&user.getStatus().intValue()!=0){
            sql+= "and status="+user.getStatus();
        }

        Connection conn=null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            conn= DbUtilPool.getConnection();
            pstm = conn.prepareStatement(sql);
            rs= pstm.executeQuery();
            while(rs.next()){
                return  rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtilPool.close(rs,pstm,conn);
        }
        return 0;
    }

    @Override
    public List<User> queryUserListByPage(PageModel pageModel, User user) {

        //String sql= "select * from user_inf limit "+pageModel.getStartRowNum() + ","+pageModel.getPageSize();
        String sql = "select * from user_inf where 1=1 ";

        if(user.getLoginname()!=null&&!"".equals(user.getLoginname())){
            sql+="and loginname like '%" +user.getLoginname() +"%' ";
        }
        if(user.getUsername()!=null&&!"".equals(user.getUsername())){
            sql+="and username like '%" +user.getUsername() +"%' ";
        }
        if(user.getStatus()!=null&&user.getStatus().intValue()!=0){
            sql+= "and status="+user.getStatus();
        }

        sql+=" limit "+pageModel.getStartRowNum()+","+pageModel.getPageSize();
        System.out.println(sql);
        Connection conn=null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<User> list = new ArrayList<>();
        try {
            conn= DbUtilPool.getConnection();
            pstm = conn.prepareStatement(sql);
            rs= pstm.executeQuery();
            while(rs.next()){
                //  ID  loginname  PASSWORD  STATUS           createdate  username
                User u = new User();
                u.setId(rs.getInt("ID"));
                u.setLoginname(rs.getString("loginname"));
                u.setPassword(rs.getString("PASSWORD"));
                u.setStatus(rs.getInt("STATUS"));
                u.setCreateDate(rs.getDate("createdate"));
                u.setUsername(rs.getString("username"));
                list.add(u);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtilPool.close(rs,pstm,conn);
        }
        return null;
    }

    @Override
    public int saveUser(User user) {
        Connection conn = null;
        PreparedStatement pstm = null;

        //1.声明 执行的sql语句
        String sql = "INSERT INTO user_inf (loginname,PASSWORD,STATUS,createdate,username) VALUES (?,?,?,?,?)";


        try {
            //3.获取连接 执行sql
            conn = DbUtilPool.getConnection();
            pstm= conn.prepareStatement(sql);
            pstm.setString(1,user.getLoginname());
            pstm.setString(2,user.getPassword());
            pstm.setInt(3,user.getStatus());
            pstm.setTimestamp(4,new Timestamp(user.getCreateDate().getTime()));//存放时间
            pstm.setString(5,user.getUsername());

            int i = pstm.executeUpdate();

            return i;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbUtilPool.close(null,pstm,conn);
        }

        return 0;
    }

    @Override
    public User getUserById(int parseInt) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        //1.声明 执行的sql语句
        String sql = "select * from user_inf where  id = "+parseInt;
        //2.创建返回的集合对象

        //3.获取连接 执行sql
        try {
            conn = DbUtilPool.getConnection();
            pstm= conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setUsername(rs.getString("username"));
                user.setLoginname(rs.getString("loginname"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setStatus(rs.getInt("STATUS"));
                user.setCreateDate(rs.getTimestamp("createdate"));
                return user;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbUtilPool.close(rs,pstm,conn);
        }

        return null;
    }

    @Override
    public void editUser(User user) {
        Connection conn = null;
        PreparedStatement pstm = null;

        //1.声明 执行的sql语句
        String sql = "UPDATE user_inf SET loginname = ?,PASSWORD=?,STATUS=?,createdate = ?,username = ? WHERE id = ?";


        try {
            //3.获取连接 执行sql
            conn = DbUtilPool.getConnection();
            pstm= conn.prepareStatement(sql);
            pstm.setString(1,user.getLoginname());
            pstm.setString(2,user.getPassword());
            pstm.setInt(3,user.getStatus());
            pstm.setTimestamp(4,new Timestamp(user.getCreateDate().getTime()));//存放时间
            pstm.setString(5,user.getUsername());
            pstm.setInt(6,user.getId());
            pstm.executeUpdate();//执行更新操作


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbUtilPool.close(null,pstm,conn);
        }

    }

    @Override
    public void delbyid(Integer id) {
        Connection conn = null;
        PreparedStatement pstm = null;

        //1.声明 执行的sql语句
        String sql =  "delete from user_inf WHERE id = ?";


        try {
            //3.获取连接 执行sql
            conn = DbUtilPool.getConnection();
            pstm= conn.prepareStatement(sql);
            pstm.setInt(1,id);
            pstm.executeUpdate();//执行更新操作
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            DbUtilPool.close(null,pstm,conn);
        }

    }

    @Override
    public User findUserByLogin(User user) {
        // 定义查询user_inf表
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = DbUtilPool.getConnection();
            pstmt = conn.prepareStatement("select * from user_inf where loginname=? and PASSWORD=?");
            pstmt.setString(1, user.getLoginname());
            pstmt.setString(2, user.getPassword());
            rs = pstmt.executeQuery();
            while (rs.next()) {
                // 定义查询的User对象
                User outUser = new User();
                outUser.setId(rs.getInt("ID"));
                outUser.setLoginname(rs.getString("loginname"));
                outUser.setPassword(rs.getString("PASSWORD"));
                outUser.setStatus(rs.getInt("STATUS"));
                outUser.setCreateDate(rs.getTimestamp("createdate"));
                outUser.setUsername(rs.getString("username"));
                return outUser;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtilPool.close(rs,pstmt,conn);
        }
        return null;
    }
}
