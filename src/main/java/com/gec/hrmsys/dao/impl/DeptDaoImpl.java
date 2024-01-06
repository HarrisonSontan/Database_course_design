package com.gec.hrmsys.dao.impl;

import com.gec.hrmsys.dao.DeptDao;
import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.utils.DbUtilPool;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//用户数据访问层，接口实现类
public class DeptDaoImpl implements DeptDao {

    @Override
    public List<Dept> getDeptAll() {
        //1、sql语句
        String sql = "SELECT * FROM dept_inf";

        //1.1创建返回的空集合
        List<Dept> list = new ArrayList<>();
        //2、获取链接

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            conn = DbUtilPool.getConnection();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while(rs.next()){
                Dept dept = new Dept();
                dept.setId(rs.getInt("ID"));
                dept.setName(rs.getString("NAME"));
                dept.setRemark(rs.getString("REMARK"));
                list.add(dept);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtilPool.close(rs,pstm,conn);
        }

        return null;
    }

    @Override
    public int getCount(){
        //1、sql语句
        String sql = "SELECT count(*) FROM dept_inf";

        //1.1创建返回的空集合
        List<Dept> list = new ArrayList<>();
        //2、获取链接

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            conn = DbUtilPool.getConnection();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtilPool.close(rs,pstm,conn);
        }
        return 0;
    }

    @Override
    public List<Dept> getUserByPage(PageModel pageModel) {
        //1、sql语句
        String sql = "SELECT * FROM dept_inf LIMIT ?,?";

        //1.1创建返回的空集合
        List<Dept> list = new ArrayList<>();
        //2、获取链接

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            conn = DbUtilPool.getConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,pageModel.getStartRowNum());
            pstm.setInt(2,pageModel.getPageSize());
            rs = pstm.executeQuery();

            while(rs.next()){
                Dept dept = new Dept();
                dept.setId(rs.getInt("ID"));
                dept.setName(rs.getString("NAME"));
                dept.setRemark(rs.getString("REMARK"));
                list.add(dept);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtilPool.close(rs,pstm,conn);
        }
        return null;
    }

}
