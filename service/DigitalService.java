package com.wjw.complete5.service;

import com.wjw.complete5.admin.Digital;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.DigitalRepository;
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
 * @Date: Create in 11:32 2018/1/25
 */
@Service
public class DigitalService extends BaseService<Digital,DigitalRepository> {
    @Autowired
    public IPublicDao<Digital> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody Digital digital) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",digital.getList());
        iPublicDao.updateTById(query,update,Digital.class);
    }
}
