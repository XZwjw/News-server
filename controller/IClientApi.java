package com.wjw.complete5.controller;

import com.wjw.complete5.admin.News;
import com.wjw.complete5.admin.Result;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description: 客户端API接口
 * @Date: Create in 19:05 2018/1/24
 */
public interface IClientApi {
    @GetMapping("find")
    Result<List<News>> getList(@RequestParam(value = "page") Integer page);         //得到频道的数据列表
//    @GetMapping("find_0{position}")
//    T getMoreList(@PathVariable(value = "position") Integer position);    //得到更多数据


}
