package com.jokerkiki.demo.service.impl;

import com.jokerkiki.demo.dao.DemoConfigDao;
import com.jokerkiki.demo.entity.DemoConfig;
import com.jokerkiki.demo.service.DemoConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 70719
 * 业务impl
 */
@Service
public class DemoConfigServiceImpl implements DemoConfigService{

    @Autowired
    DemoConfigDao demoConfigDao;
    @Override
    public DemoConfig findById(Long id) {
        return demoConfigDao.findById(id);
    }

    @Override
    public int addDemoConfig(DemoConfig demoConfig) {
        return demoConfigDao.addDemoConfig(demoConfig);
    }

    @Override
    public int updateDemoConfig(DemoConfig demoConfig) {
        return demoConfigDao.updateDemoConfig(demoConfig);
    }

    @Override
    public int deleteDemoConfig(Long id) {
        return demoConfigDao.deleteDemoConfig(id);
    }
}
