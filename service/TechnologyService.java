package com.wjw.complete5.service;

import com.wjw.complete5.admin.Technology;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 16:09 2018/1/19
 */
@Service
public class TechnologyService extends BaseService<Technology,TechnologyRepository>{

    @Autowired
    public IPublicDao<Technology> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody Technology technology) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",technology.getList());
        iPublicDao.updateTById(query,update,Technology.class);
    }
}
