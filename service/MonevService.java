package com.wjw.complete5.service;

import com.wjw.complete5.admin.Monev;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.MonevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 16:19 2018/1/19
 */
@Service
public class MonevService extends BaseService<Monev,MonevRepository> {
    @Autowired
    public IPublicDao<Monev> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody Monev monev) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",monev.getList());
        iPublicDao.updateTById(query,update,Monev.class);
    }
}
