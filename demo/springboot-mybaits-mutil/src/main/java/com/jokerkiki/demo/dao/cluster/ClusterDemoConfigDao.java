package com.jokerkiki.demo.dao.cluster;

import com.jokerkiki.demo.entity.DemoConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClusterDemoConfigDao {

    DemoConfig findById(@Param("id") Long id);

    int addConfig(DemoConfig demoConfig);

    int updateConfig(DemoConfig demoConfig);

    int deleteConfig(Long id);
}
