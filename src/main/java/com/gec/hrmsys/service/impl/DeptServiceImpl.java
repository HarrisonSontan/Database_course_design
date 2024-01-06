package com.gec.hrmsys.service.impl;

import com.gec.hrmsys.dao.DeptDao;
import com.gec.hrmsys.dao.impl.DeptDaoImpl;
import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.service.DeptService;
import com.gec.hrmsys.service.UserService;

import java.util.List;

public class DeptServiceImpl implements DeptService {

    DeptDao deptDao = new DeptDaoImpl();


    @Override
    public List<Dept> getDeptAll() {
        return deptDao.getDeptAll();
    }

    @Override
    public List<Dept> getDeptByPage(PageModel pageModel) {
        //1.调用dao方法 实现查询当前表地总条数
        int count = deptDao.getCount();
        pageModel.setTotalRecordSum(count);
        return deptDao.getUserByPage(pageModel);
    }
}
