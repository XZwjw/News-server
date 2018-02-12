package com.wjw.complete5.service;

import com.wjw.complete5.admin.Lady;
import com.wjw.complete5.admin.News;
import com.wjw.complete5.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description: 各种类型新闻的Service
 * @ Date: Create in 17:10 2018/1/17
 */

@Service
public class NewsService {

    @Autowired
    public NewsRepository newsRepository;

    public List<News> findAll() {
        return newsRepository.findAll();
    }

    public News findOneById(String id) {
        return newsRepository.findOne(id);
    }

    public void save(News t) {
        newsRepository.save(t);
    }

    public void delete(String id) {
        newsRepository.delete(id);
    }

    public void delete(News t) {
        newsRepository.delete(t);
    }

    /**
     * 期待更新接口中。。。
     * @param id
     */
//    private void updateNameById(String id) {
//        Query query = new Query(Criteria.where("_id").is(id));
//
//
//    }


}
