package com.wjw.complete5.repository;

import com.wjw.complete5.admin.Art;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 11:07 2018/1/25
 */
public interface ArtRepository extends MongoRepository<Art,String> {

}
