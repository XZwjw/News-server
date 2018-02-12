package com.wjw.complete5.service;

import com.wjw.complete5.admin.Sports;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.SportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 12:00 2018/1/19
 */
@Service
public class SportsService extends BaseService<Sports,SportsRepository> {
    @Autowired
    public IPublicDao<Sports> iPublicDao;
    @Override
    public void updateTById(String id,@RequestParam("list") Sports sports) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",sports.getList());
        iPublicDao.updateTById(query,update,Sports.class);
    }
}
