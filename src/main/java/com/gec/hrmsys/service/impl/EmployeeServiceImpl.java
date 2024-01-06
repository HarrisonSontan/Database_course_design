package com.gec.hrmsys.service.impl;

import com.gec.hrmsys.dao.EmployeeDao;
import com.gec.hrmsys.dao.impl.EmployeeDaoImpl;
import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.Employee;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao = new EmployeeDaoImpl();

	@Override
	public List<Employee> queryEmployeeListByPage(PageModel pageModel) {
		pageModel.setTotalRecordSum(employeeDao.getEmployeeListCount());
		return employeeDao.queryEmployeeListByPage(pageModel);
	}

	@Override
	public List<Dept> getEmployeeByDept() {
		return employeeDao.getEmployeeByDept();
	}

	@Override
	public List<Job> getEmployeeByJob() {
		return employeeDao.getEmployeeByJob();
	}

	@Override
	public boolean queryEmployeeListByCardId(String cardId) {
		int i = employeeDao.queryEmployeeListByCardId(cardId);
		if(i>0){ //已经存在
			return false;
		}
		return true;
	}

	@Override
	public void empSave(Employee employee) {
		employeeDao.empSave(employee);
	}
}
