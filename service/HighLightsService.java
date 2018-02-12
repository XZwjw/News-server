package com.wjw.complete5.service;

import com.wjw.complete5.admin.HighLights;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.HighLightsRepository;
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
 * @Date: Create in 16:01 2018/1/19
 */
@Service
public class HighLightsService extends BaseService<HighLights,HighLightsRepository> {
    @Autowired
    public IPublicDao<HighLights> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody HighLights highLights) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",highLights.getList());
        iPublicDao.updateTById(query,update,HighLights.class);
    }
}
