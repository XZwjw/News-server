package com.wjw.complete5.repository;

import com.wjw.complete5.admin.Education;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 11:09 2018/1/25
 */
public interface EducationRepository extends MongoRepository<Education,String> {
}
