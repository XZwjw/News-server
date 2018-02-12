package com.wjw.complete5.dao;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * Author:JiawangWang
 *
 * @ Description:新闻修改所需要的dao层
 * @ Date: Create in 17:18 2018/1/17
 */
public interface IPublicDao<T> {
    void updateTById(Query query, Update update,Class T);
}
