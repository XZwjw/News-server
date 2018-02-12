
package com.wjw.complete5.admin;

import com.alibaba.fastjson.JSON;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * Author:JiawangWang
 *
 * @ Description:新闻关键词类
 * @ Date: Create in 16:46 2018/1/17
 */
@Document
public class Keywords {

    @Id
    @GeneratedValue
    private String id;

    private String akey_link;
    private String keyname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setAkey_link(String akey_link) {
        this.akey_link = akey_link;
    }
    public String getAkey_link() {
        return akey_link;
    }


    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public String getKeyname() {
        return keyname;
    }
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}