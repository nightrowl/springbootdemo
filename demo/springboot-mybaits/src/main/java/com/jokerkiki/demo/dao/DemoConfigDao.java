package com.jokerkiki.demo.dao;

import com.jokerkiki.demo.entity.DemoConfig;
import org.apache.ibatis.annotations.Param;

/**
 * @author 70719
 * 测试接口
 */
public interface DemoConfigDao {

    DemoConfig findById(@Param("id") Long id);

    int addDemoConfig(DemoConfig demoConfig);

    int updateDemoConfig(DemoConfig demoConfig);

    int deleteDemoConfig(Long id);
}
