package com.wjw.complete5.service;

import com.wjw.complete5.admin.Mobile;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.MobileRepository;
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
 * @Date: Create in 16:17 2018/1/19
 */
@Service
public class MobileService extends BaseService<Mobile,MobileRepository> {
    @Autowired
    public IPublicDao<Mobile> iPublicDao;

    /**
     * T即为Mobile,根据id更新Mobile
     * @param id
     * @param mobile
     */
    @Override
    public void updateTById(String id,@RequestBody Mobile mobile) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",mobile);
        iPublicDao.updateTById(query,update,Mobile.class);
    }

}
