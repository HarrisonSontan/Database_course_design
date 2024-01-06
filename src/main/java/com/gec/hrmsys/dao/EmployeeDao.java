package com.gec.hrmsys.dao;

import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.Employee;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.domain.PageModel;

import java.util.List;

public interface EmployeeDao {

	public List<Employee> queryEmployeeListByPage(PageModel pageModel);

	public int getEmployeeListCount();

    List<Dept> getEmployeeByDept();

	List<Job> getEmployeeByJob();

	int queryEmployeeListByCardId(String cardId);

	void empSave(Employee employee);
}