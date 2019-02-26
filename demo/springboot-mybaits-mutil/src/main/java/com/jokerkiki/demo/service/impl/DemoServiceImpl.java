package com.jokerkiki.demo.service.impl;

import com.jokerkiki.demo.dao.cluster.ClusterDemoConfigDao;
import com.jokerkiki.demo.dao.master.MasterDemoConfigDao;
import com.jokerkiki.demo.entity.DemoConfig;
import com.jokerkiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    MasterDemoConfigDao masterDemoConfigDao;

    @Autowired
    ClusterDemoConfigDao clusterDemoConfigDao;

    @Override
    public Object findConfigById(Long id) {
        return masterDemoConfigDao.findById(id);
    }

    @Override
    public int addConfig(DemoConfig demoConfig) {
        return masterDemoConfigDao.addConfig(demoConfig);
    }

    @Override
    public int updateConfig(DemoConfig demoConfig) {
        return masterDemoConfigDao.updateConfig(demoConfig);
    }

    @Override
    public int deleteConfig(Long id) {
        return masterDemoConfigDao.deleteConfig(id);
    }

    @Override
    public Object findClusterConfigById(Long id) {
        return clusterDemoConfigDao.findById(id);
    }

    @Override
    public int addClusterConfig(DemoConfig demoConfig) {
        return clusterDemoConfigDao.addConfig(demoConfig);
    }

    @Override
    public int updateClusterConfig(DemoConfig demoConfig) {
        return clusterDemoConfigDao.updateConfig(demoConfig);
    }

    @Override
    public int deleteClusterConfig(Long id) {
        return clusterDemoConfigDao.deleteConfig(id);
    }
}
