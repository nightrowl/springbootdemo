package com.jokerkiki.demo.dao.impl;

import com.jokerkiki.demo.dao.DemoDao;
import com.jokerkiki.demo.entity.Demo;
import com.jokerkiki.demo.entity.ReturnResult;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 70719
 *
 */
@Repository
public class DemoDaoImpl implements DemoDao{

    private static List<Demo> demoList = new ArrayList<>();
    static {
        for(long i = 0 ; i < 10;i++){
            Demo demo = new Demo();
            demo.setId(i);
            demo.setName(""+i);
            demo.setContent("zhangsan"+i);
            demoList.add(demo);
        }
    }
    /**
     * 新增方法
     * @param demo
     * @return
     */
    @Override
    public ReturnResult add(Demo demo) {
        demoList.add(demo);
        System.out.println(demo);
    return ReturnResult.success(demoList);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public Object delete(Long id) {
        Demo demo = demoList.get(id.intValue());
        demoList.remove(demo);
        System.out.println(demoList);
        return ReturnResult.success(demoList);
    }

    @Override
    public Object update(Demo demo) {
        Demo updateDemo = demoList.get(demo.getId().intValue());
        updateDemo.setName("lisi");
        demoList.remove(demo);
        demoList.add(updateDemo);
        return ReturnResult.success(demoList);
    }

    @Override
    public Object query(Demo demo) {
        return demoList.get(demo.getId().intValue());
    }
}
