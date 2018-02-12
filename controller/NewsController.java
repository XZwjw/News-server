package com.wjw.complete5.controller;

import com.wjw.complete5.admin.*;
import com.wjw.complete5.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description: Controller的基类
 * @ Date: Create in 18:19 2018/1/17
 */

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private  NewsService newsService;

    @GetMapping()
    public List<News> findAll() {
        return newsService.findAll();
    }

    @GetMapping("/{id}")
    public News findOneById(String id) {
        return newsService.findOneById(id);
    }

    @PostMapping()
    public String save(@RequestBody News t) {
        newsService.save(t);
        return t.toString();
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestParam("id") String id) {
        newsService.delete(id);
    }
}
