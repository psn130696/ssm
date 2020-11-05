package com.deyuan.test;

import com.deyuan.dao.SyslogDao;
import com.deyuan.dao.UserDao;
import com.deyuan.pojo.SysLog;
import com.deyuan.pojo.UserInfo;
import com.deyuan.service.ISyslogService;
import com.deyuan.service.impl.SyslogServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ISyslogService iSyslogService = context.getBean(ISyslogService.class);
        SysLog sysLog=new SysLog();
        sysLog.setUsername("张三");
        iSyslogService.save(sysLog);


    }
}
