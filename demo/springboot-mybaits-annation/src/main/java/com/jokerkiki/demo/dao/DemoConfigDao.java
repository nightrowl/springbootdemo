package com.jokerkiki.demo.dao;

import com.jokerkiki.demo.entity.DemoConfig;
import org.apache.ibatis.annotations.*;

/**
 * @author 70719
 * 测试接口
 */
@Mapper
public interface DemoConfigDao {

    @Select("select * from s_config where id =#{id}")
    DemoConfig findById(@Param("id") Long id);

    @Insert("Insert into s_config(id,config,configValue) values(#{id},#{config},#{configValue})")
    int addConfig(DemoConfig demoConfig);

    @Update("update s_config set config = #{config} where id = #{id}")
    int updateConfig(DemoConfig demoConfig);

    @Delete("delete from s_config where id = #{id}")
    int deleteConfig(Long id);
}
