package com.jokerkiki.demo.service;

import com.jokerkiki.demo.entity.Demo;
import com.jokerkiki.demo.entity.ReturnResult;

/**
 * demo业务层接口
 * @author 70719
 */
public interface DemoService {

    /**
     * 新增
     * @param demo
     * @return
     */
    ReturnResult add(Demo demo);

    /**
     * 删除
     * @param id
     * @return
     */
    Object delete(Long id);

    /**
     * 修改
     * @param demo
     * @return
     */
    Object update(Demo demo);

    /**
     * 查询
     * @param demo
     * @return
     */
    Object query(Demo demo);
}
