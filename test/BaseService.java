package com.wjw.complete5.test;

import com.wjw.complete5.admin.News;
import com.wjw.complete5.dao.IPublicDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 18:48 2018/1/19
 */
public class BaseService<T1,T2 extends MongoRepository<T1,String>> {

    @Autowired
    private T2 t2;

    @Autowired
    public IPublicDao<T1> iPublicDao;

    public List<T1> findAll() {
        return t2.findAll();
    }

    public void save(T1 t1) {
        t2.save(t1);
    }

    public void updateTById(String id,Lacy lacy) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",lacy.getList());
        iPublicDao.updateTById(query,update,Lacy.class);
    }



}
