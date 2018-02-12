package com.wjw.complete5.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 17:56 2018/1/19
 */
@RestController
@RequestMapping("/test")
public class Lady1Controller {

    @Autowired
    private Lady1Service service;

    @GetMapping()
    public Result<List<Lacy>> findAll() {
        Result<List<Lacy>> result = new Result<>();
        List<Lacy> lacies = service.findAll();
        if(lacies == null) {
            result.setCode(201);
            result.setData(null);
            result.setMsg("数据为空");
        } else {
            result.setCode(200);
            result.setMsg("获得数据");
            result.setData(lacies);
        }
        return result;
    }

    @PostMapping()
    public String save(@RequestBody Lacy lady1) {
        service.save(lady1);
        return lady1.toString();
    }

    @PutMapping("/{id}")
    public void updateTById(@PathVariable("id") String id,@RequestBody Lacy lacy) {
         service.updateTById(id,lacy);
    }

}
