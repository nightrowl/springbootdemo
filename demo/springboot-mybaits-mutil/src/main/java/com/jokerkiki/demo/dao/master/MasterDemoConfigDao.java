package com.jokerkiki.demo.dao.master;

import com.jokerkiki.demo.entity.DemoConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MasterDemoConfigDao {
    DemoConfig findById(@Param("id") Long id);

    int addConfig(DemoConfig demoConfig);

    int updateConfig(DemoConfig demoConfig);

    int deleteConfig(Long id);
}
