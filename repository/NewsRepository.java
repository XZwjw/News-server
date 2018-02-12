package com.wjw.complete5.repository;

import com.wjw.complete5.admin.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 17:06 2018/1/17
 */

public interface NewsRepository extends MongoRepository<News, String> {

}
