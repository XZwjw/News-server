package com.wjw.complete5.controller;

import com.wjw.complete5.admin.Sports;
import com.wjw.complete5.service.IBaseService;
import com.wjw.complete5.service.NewsService;
import com.wjw.complete5.service.SportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 18:44 2018/1/17
 */
@RestController
@RequestMapping("/sports")
public class SportsController extends BaseController<Sports> {

}
