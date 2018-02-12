package com.wjw.complete5.service;

import com.wjw.complete5.admin.Art;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.ArtRepository;
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
 * @Date: Create in 11:22 2018/1/25
 */
@Service
public class ArtService extends BaseService<Art,ArtRepository>{

    @Autowired
    public IPublicDao<Art> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody Art art) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",art.getList());
        iPublicDao.updateTById(query,update,Art.class);
    }
}
