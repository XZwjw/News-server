package com.wjw.complete5.admin;

import com.alibaba.fastjson.JSON;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * Author:JiawangWang
 *
 * @ Description:要闻类新闻
 * @ Date: Create in 16:45 2018/1/17
 */
@Document(collection = "HighLights")
public class HighLights extends BaseBean{

}
