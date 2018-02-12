package com.wjw.complete5.admin;

import com.alibaba.fastjson.JSON;

import javax.persistence.GeneratedValue;
import java.util.List;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 10:59 2018/1/25
 */
public class BaseBean {

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
