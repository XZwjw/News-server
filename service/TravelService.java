package com.wjw.complete5.service;

import com.wjw.complete5.admin.Travel;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.TravelRepository;
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
 * @Date: Create in 16:37 2018/1/19
 */
@Service
public class TravelService  extends BaseService<Travel,TravelRepository>{
    @Autowired
    public IPublicDao<Travel> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody Travel travel) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",travel.getList());
        iPublicDao.updateTById(query,update,Travel.class);
    }
}
