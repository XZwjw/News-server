package com.wjw.complete5.repository;

import com.wjw.complete5.admin.Sports;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 12:06 2018/1/19
 */
public interface SportsRepository extends MongoRepository<Sports, String> {

}
