package com.gec.hrmsys.service;

import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.Employee;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.domain.PageModel;

import java.util.List;

public interface EmployeeService {
	public List<Employee> queryEmployeeListByPage(PageModel pageModel);

	List<Dept> getEmployeeByDept();

	List<Job> getEmployeeByJob();

	boolean queryEmployeeListByCardId(String cardId);

    void empSave(Employee employee);
}