package com.wjw.complete5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 17:21 2018/1/17
 */
@Repository
public class PublicDaoImpl<T> implements IPublicDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void updateTById(Query query, Update update, Class t) {
        mongoTemplate.updateMulti(query,update,t);
    }



}
