package com.jokerkiki.demo.service.impl;

import com.jokerkiki.demo.dao.DemoDao;
import com.jokerkiki.demo.entity.Demo;
import com.jokerkiki.demo.entity.ReturnResult;
import com.jokerkiki.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 70719
 *
 */
@Service
public class DemoServiceImpl implements DemoService {


    @Autowired
    DemoDao demoDao;
    /**
     * 新增
     * @param demo
     * @return
     */
    @Override
      public  ReturnResult add(Demo demo){
        return demoDao.add(demo);
    }

    @Override
    public Object delete(Long id) {
        return demoDao.delete(id);
    }

    @Override
    public Object update(Demo demo) {
        return demoDao.update(demo);
    }

    @Override
    public Object query(Demo demo) {
        return demoDao.query(demo);
    }
}
