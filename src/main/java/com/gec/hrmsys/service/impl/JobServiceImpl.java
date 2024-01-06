package com.gec.hrmsys.service.impl;

import com.gec.hrmsys.dao.JobDao;
import com.gec.hrmsys.dao.impl.JobDaoImpl;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.service.JobService;

import java.util.List;

public class JobServiceImpl implements JobService {

    JobDao jobDao = new JobDaoImpl();
    @Override
    public List<Job> getDeptAll() {
        return jobDao.getDeptAll();
    }
}
