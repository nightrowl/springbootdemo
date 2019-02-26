package com.jokerkiki.demo.service.impl;

import com.jokerkiki.demo.dao.DemoConfigDao;
import com.jokerkiki.demo.entity.DemoConfig;
import com.jokerkiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    DemoConfigDao demoConfigDao;

    @Override
    public Object findConfigById(Long id) {
        return demoConfigDao.findById(id);
    }

    @Override
    public int addConfig(DemoConfig demoConfig) {
        return demoConfigDao.addConfig(demoConfig);
    }

    @Override
    public int updateConfig(DemoConfig demoConfig) {
        return demoConfigDao.updateConfig(demoConfig);
    }

    @Override
    public int deleteConfig(Long id) {
        return demoConfigDao.deleteConfig(id);
    }
}
