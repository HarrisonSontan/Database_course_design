package com.gec.hrmsys.dao;

import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.Job;

import java.util.List;

public interface JobDao {
    List<Job> getDeptAll();
}
