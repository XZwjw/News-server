package com.wjw.complete5.controller;

import com.wjw.complete5.admin.Travel;
import com.wjw.complete5.service.IBaseService;
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
@RequestMapping("/travel")
public class TravelController extends BaseController<Travel>{
}
