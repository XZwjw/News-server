package com.wjw.complete5.controller;

import com.wjw.complete5.admin.BaseBean;
import com.wjw.complete5.admin.News;
import com.wjw.complete5.admin.Result;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 19:48 2018/1/18
 */

public interface IBaseController<T> {
    /**
     * 找到所有
     * @return
     */
    @GetMapping("/findAll")
    Result<List<T>> findAll();

    /**
     * 提交一条数据
     * @param t
     * @return
     */
    @PostMapping("/save")
    Result<String> save(T t);

    /**
     * 根据ID找到一条数据
     * @param id
     * @return
     */
    @GetMapping("findOne/{id}")
    Result<T> findOneById(@PathVariable("id") String id);

    /**
     *根据ID删除所查询到的T
     * @param id
     */
    @DeleteMapping("/delete/{id}")
    Result<String> delete(@PathVariable(value = "id") String id);

    @PutMapping("/update/{id}")
    Result<String> updateTById(@PathVariable(value = "id") String id,T t);

//    /**
//     * 根据对象找到其所在从而删除
//     * @param t
//     */
//    @DeleteMapping("/delete")
//    void delete(T t);



}
