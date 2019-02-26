package com.jokerkiki.demo.service.impl;

import com.jokerkiki.demo.dao.ConfigRepository;
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
    ConfigRepository configRepository;
    @Override
    public DemoConfig findById(Long id) {
        return configRepository.findById(id).get();
    }

    @Override
    public int addDemoConfig(DemoConfig demoConfig) {
        return configRepository.save(demoConfig).getId().intValue();
    }

    @Override
    public int updateDemoConfig(DemoConfig demoConfig) {
        return configRepository.save(demoConfig).getId().intValue();
    }

    @Override
    public int deleteDemoConfig(Long id) {
        configRepository.deleteById(id);
        return 0;
    }
}
