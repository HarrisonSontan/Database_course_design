package com.gec.hrmsys.dao.impl;

import com.gec.hrmsys.dao.EmployeeDao;
import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.Employee;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.utils.DbUtilPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl  implements EmployeeDao {
	@Override
	public List<Employee> queryEmployeeListByPage(PageModel pageModel) {
		// TODO Auto-generated method stub
		// 获取数据库的连接对象
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Employee> employeeList = new ArrayList<>();

		String sql ="select e.*, d.ID as DEPT_ID ,d.Name as dept_name ,j.ID as JOB_ID ,j.Name as job_name from dept_inf d right join employee_inf e on d.ID = e.DEPT_ID left join job_inf j on e.JOB_ID= j.ID  limit ?,?";

		try {
			conn = DbUtilPool.getConnection();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1,pageModel.getStartRowNum());
			stmt.setInt(2,pageModel.getPageSize());
			rs = stmt.executeQuery();

			while (rs.next()) {

				Employee outEmployee = new Employee();
				outEmployee.setId(rs.getInt("ID"));

				Dept dept = new Dept();
				dept.setId(rs.getInt("DEPT_ID"));
				dept.setName(rs.getString("dept_name"));
				outEmployee.setDept(dept);

				Job job = new Job();
				job.setId(rs.getInt("JOB_ID"));
				job.setName(rs.getString("job_name"));
				outEmployee.setJob(job);

				outEmployee.setName(rs.getString("NAME"));
				outEmployee.setCardId(rs.getString("CARD_ID"));
				outEmployee.setAddress(rs.getString("ADDRESS"));
				outEmployee.setPostCode(rs.getString("POST_CODE"));
				outEmployee.setTel(rs.getString("TEL"));
				outEmployee.setPhone(rs.getString("PHONE"));
				outEmployee.setQqNum(rs.getString("QQ_NUM"));

				outEmployee.setEmail(rs.getString("EMAIL"));
				outEmployee.setSex(rs.getInt("SEX"));
				outEmployee.setParty(rs.getString("PARTY"));
				outEmployee.setBirthday(rs.getDate("BIRTHDAY"));
				outEmployee.setRace(rs.getString("RACE"));
				outEmployee.setEducation(rs.getString("EDUCATION"));

				outEmployee.setSpeciality(rs.getString("SPECIALITY"));
				outEmployee.setHobby(rs.getString("HOBBY"));
				outEmployee.setRemark(rs.getString("REMARK"));
				outEmployee.setCreateDate(rs.getTimestamp("CREATE_DATE"));

				employeeList.add(outEmployee);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
  			DbUtilPool.close(rs,stmt,conn);
		}

		return employeeList;
	}

	@Override
	public int getEmployeeListCount() {
		// 获取数据库的连接对象
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "select count(*) from employee_inf";

		try {
			conn = DbUtilPool.getConnection();
			pstm = conn.prepareStatement(sql);
			 rs = pstm.executeQuery();
			while (rs.next()) {
				int count = rs.getInt(1);
				return count;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilPool.close(rs,pstm,conn);
		}
		return 0;
	}

	@Override
	public List<Dept> getEmployeeByDept() {
		// 获取数据库的连接对象
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs  = null;
		List<Dept> deptList = new ArrayList<>();

		String  sql= "select * from dept_inf";

		try {
			conn = DbUtilPool.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Dept outDept = new Dept();
				outDept.setId(rs.getInt(1));
				outDept.setName(rs.getString(2));
				deptList.add(outDept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtilPool.close(rs,stmt,conn);
		}
		return deptList;
	}

	@Override
	public List<Job> getEmployeeByJob() {
		// TODO Auto-generated method stub
		// 获取数据库的连接对象
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs =null;
		List<Job> jobList = new ArrayList<>();

		String sql="select * from job_inf";

		try {
			conn = DbUtilPool.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				Job outJob = new Job();
				outJob.setId(rs.getInt(1));
				outJob.setName(rs.getString(2));
				jobList.add(outJob);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DbUtilPool.close(rs,stmt,conn);
		}
		return jobList;
	}

	@Override
	public int queryEmployeeListByCardId(String cardId) {
		// 获取数据库的连接对象
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "SELECT COUNT(*) FROM employee_inf " +
				"WHERE CARD_ID = ?";


		try {
			conn = DbUtilPool.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,cardId);
			rs = pstm.executeQuery();
			while (rs.next()) {
				int count = rs.getInt(1);
				return count;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilPool.close(rs,pstm,conn);
		}
		return 0;
	}

	@Override
	public void empSave(Employee employee) {
		Connection conn = null;
		PreparedStatement pstm = null;

		//1.声明 执行的sql语句
		String sql = "INSERT INTO employee_inf (DEPT_ID,JOB_ID,NAME,CARD_ID,ADDRESS,PHONE,EMAIL,SEX,CREATE_DATE) VALUES (?,?,?,?,?,?,?,?,?)";


		try {
			//3.获取连接 执行sql
			conn = DbUtilPool.getConnection();
			pstm= conn.prepareStatement(sql);
			pstm.setInt(1,employee.getDept().getId());
			pstm.setInt(2,employee.getJob().getId());
			pstm.setString(3,employee.getName());
			pstm.setString(4,employee.getCardId());//存放时间
			pstm.setString(5,employee.getAddress());
			pstm.setString(6,employee.getPhone());
			pstm.setString(7,employee.getEmail());
			pstm.setInt(8,employee.getSex());
			pstm.setDate(9,new java.sql.Date(employee.getCreateDate().getTime()));
			int i = pstm.executeUpdate();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			DbUtilPool.close(null,pstm,conn);
		}
	}
}