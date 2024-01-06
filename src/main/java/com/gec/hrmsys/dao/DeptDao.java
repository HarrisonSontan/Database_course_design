package com.gec.hrmsys.dao;

import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.PageModel;

import java.util.List;

public interface DeptDao {
    List<Dept> getDeptAll();

    int getCount();

    List<Dept> getUserByPage(PageModel pageModel);
}
