package com.wjw.complete5.service;

import com.mongodb.util.JSON;
import com.wjw.complete5.admin.BaseBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 20:03 2018/1/18
 */

public interface IBaseService<T> {
    List<T> findAll();      //查找所有
    void save(T t);         //保存
    T findOneById(String id);   //根据ID找到一个
    void delete(String id);     //根据id删除对应的那个
    void updateTById(String id,T list); //根据id修改T
}
