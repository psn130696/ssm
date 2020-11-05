package com.deyuan.service.impl;

import com.deyuan.dao.SyslogDao;
import com.deyuan.pojo.SysLog;
import com.deyuan.service.ISyslogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SyslogServiceImpl implements ISyslogService {

    @Autowired
    private SyslogDao syslogDao;

    @Override
    public void save(SysLog sysLog) {
        syslogDao.save(sysLog);
    }

    @Override
    public List<SysLog> findAll() {
        return syslogDao.findAll();
    }
}
