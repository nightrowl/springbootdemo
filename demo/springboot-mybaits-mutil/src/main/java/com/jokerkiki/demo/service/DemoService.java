package com.jokerkiki.demo.service;

import com.jokerkiki.demo.entity.DemoConfig;

/**
 *
 * @author 70719
 */
public interface DemoService {

    Object findConfigById(Long id);

    int addConfig(DemoConfig demoConfig);

    int updateConfig(DemoConfig demoConfig);

    int deleteConfig(Long id);

    Object findClusterConfigById(Long id);

    int addClusterConfig(DemoConfig demoConfig);

    int updateClusterConfig(DemoConfig demoConfig);

    int deleteClusterConfig(Long id);
}
