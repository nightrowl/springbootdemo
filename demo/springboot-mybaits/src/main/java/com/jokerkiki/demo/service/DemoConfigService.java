package com.jokerkiki.demo.service;

import com.jokerkiki.demo.entity.DemoConfig;

/**
 *
 * @author 70719
 * 业务jiekou
 */
public interface DemoConfigService {

    DemoConfig findById(Long id);

    int addDemoConfig(DemoConfig demoConfig);

    int updateDemoConfig(DemoConfig demoConfig);

    int deleteDemoConfig(Long id);
}
