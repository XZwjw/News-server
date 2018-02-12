package com.wjw.complete5.controller;


import com.alibaba.fastjson.JSON;
import com.wjw.complete5.admin.BaseBean;
import com.wjw.complete5.admin.News;
import com.wjw.complete5.admin.Result;
import com.wjw.complete5.service.IBaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;


/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 12:16 2018/1/19
 */

public class BaseController<T> implements IBaseController<T>,IClientApi{
    private Logger logger = Logger.getLogger(BaseController.class);

    @Autowired
    private  IBaseService<T> baseService;

    @Override
    public Result<List<T>> findAll() {
        logger.info("findAll");
        Result<List<T>> result = new Result<>();
        result.setCode(200);
        result.setData(baseService.findAll());
        return result;
    }

    @Override
    public Result<String> save(@RequestBody T t) {
        if(baseService == null) {
            logger.info("service为空");
        }else {
            logger.info("啦啦啦");
            baseService.save(t);
            logger.info("完成");
        }
        Result<String> result = new Result<>();
        result.setCode(200);
        result.setData(t.toString());
        return result;
    }

    @Override
    public Result<T> findOneById(@PathVariable("id") String id) {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setData(baseService.findOneById(id));
        return result;
    }


    @Override
    public Result<String> delete(@PathVariable("id") String id) {
        baseService.delete(id);
        Result<String> result = new Result<>();
        result.setData("删除成功");
        result.setCode(200);
        return result;
    }

    @Override
    public Result<String> updateTById(@PathVariable(value = "id") String id, @RequestBody T t) {
        baseService.updateTById(id,t);
        Result<String> result = new Result<>();
        result.setCode(200);
        result.setData("修改成功");
        return result;
    }

    @Override
    public Result getList(Integer page) {
        T t = baseService.findAll().get(page);
        if(t instanceof BaseBean) {
            Result<List<News>> result = new Result<>();
            result.setData(((BaseBean)t).getList());
            result.setCode(200);
            return result;
        } else {
            Result<T> result = new Result<>();
            result.setData(t);
            result.setCode(200);
            return result;
        }
    }

//    @Override
//    public T getMoreList(@PathVariable(value = "position") Integer position) {
//        logger.info("baseService.findAll().size():"+baseService.findAll().size());
//        return baseService.findAll().get(position-1);
//    }

}
