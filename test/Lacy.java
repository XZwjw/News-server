package com.wjw.complete5.test;

import com.alibaba.fastjson.JSON;
import com.wjw.complete5.admin.News;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 17:05 2018/1/19
 */
@Document
public class Lacy {

    private List<News> list;

    public List<News> getList() {
        return list;
    }

    public void setList(List<News> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
