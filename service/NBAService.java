package com.wjw.complete5.service;

import com.wjw.complete5.admin.NBA;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.NBARepository;
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
 * @Date: Create in 11:11 2018/1/25
 */
@Service
public class NBAService extends BaseService<NBA,NBARepository> {
    @Autowired
    public IPublicDao<NBA> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody NBA nba) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",nba.getList());
        iPublicDao.updateTById(query,update,NBA.class);
    }
}
