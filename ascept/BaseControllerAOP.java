package com.wjw.complete5.ascept;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * Author:JiawangWang
 *
 * Description:用于登录验证的表单验证
 * 待完善
 * Date: Create in 11:17 2018/2/5
 */
@Aspect
@Component
public class BaseControllerAOP {
    Logger logger = Logger.getLogger(BaseControllerAOP.class);

    @Pointcut("execution(public * com.wjw.complete5.controller.BaseController.*(..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore() {
        logger.info("啦啦啦");
    }

    @After("log())")
    public void after() {
        logger.info("哈哈哈");
    }
}
