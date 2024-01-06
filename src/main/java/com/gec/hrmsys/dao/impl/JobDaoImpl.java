package com.gec.hrmsys.dao.impl;

import com.gec.hrmsys.dao.JobDao;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.utils.DbUtilPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//用户数据访问层，接口实现类
public class JobDaoImpl implements JobDao {

    @Override
    public List<Job> getDeptAll() {
        //1、sql语句
        String sql = "SELECT * FROM job_inf";

        //1.1创建返回的空集合
        List<Job> list = new ArrayList<>();
        //2、获取链接

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try{
            conn = DbUtilPool.getConnection();
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while(rs.next()){
                Job job = new Job();
                job.setId(rs.getInt("ID"));
                job.setName(rs.getString("NAME"));
                job.setRemark(rs.getString("REMARK"));
                list.add(job);
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
