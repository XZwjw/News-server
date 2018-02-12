package com.wjw.complete5.service;

import com.wjw.complete5.admin.Education;
import com.wjw.complete5.dao.IPublicDao;
import com.wjw.complete5.repository.EducationRepository;
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
 * @Date: Create in 11:23 2018/1/25
 */
@Service
public class EducationService extends BaseService<Education,EducationRepository> {
    @Autowired
    public IPublicDao<Education> iPublicDao;
    @Override
    public void updateTById(String id,@RequestBody Education education) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("list",education.getList());
        iPublicDao.updateTById(query,update,Education.class);
    }
}
