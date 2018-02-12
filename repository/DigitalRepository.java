package com.wjw.complete5.repository;

import com.wjw.complete5.admin.Digital;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 11:08 2018/1/25
 */
public interface DigitalRepository extends MongoRepository<Digital,String> {
}
