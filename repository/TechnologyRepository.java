package com.wjw.complete5.repository;

import com.wjw.complete5.admin.Technology;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 15:57 2018/1/19
 */
public interface TechnologyRepository extends MongoRepository<Technology,String>{
}
