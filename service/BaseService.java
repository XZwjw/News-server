package com.wjw.complete5.service;

import com.wjw.complete5.admin.BaseBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 18:48 2018/1/19
 */

public abstract class BaseService<T1,T2 extends MongoRepository<T1,String>> implements IBaseService<T1>{

    @Autowired
    private T2 t2;


    @Override
    public List<T1> findAll() {
        return t2.findAll();
    }

    @Override
    public void save(T1 t1) {
        t2.save(t1);
    }

    @Override
    public T1 findOneById(String id) {
        return t2.findOne(id);
    }

    @Override
    public void delete(String id) {
        t2.delete(id);
    }


//    @Override
//    public void delete(T1 t1) {
//
//    }

}
