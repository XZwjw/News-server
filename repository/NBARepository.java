package com.wjw.complete5.repository;

import com.wjw.complete5.admin.NBA;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 11:10 2018/1/25
 */
public interface NBARepository extends MongoRepository<NBA,String> {
}
