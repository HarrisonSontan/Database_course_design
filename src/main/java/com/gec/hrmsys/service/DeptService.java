package com.gec.hrmsys.service;

import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.PageModel;

import java.util.List;

public interface DeptService {
    List<Dept> getDeptAll();

    List<Dept> getDeptByPage(PageModel pageModel);

}
