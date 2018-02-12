package com.wjw.complete5.admin;

import com.alibaba.fastjson.JSON;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;
/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 16:46 2018/1/17
 */
@Document
 public class News {

    @Id
    @GeneratedValue
    private String id;

    private String title;
    private String digest;
    private String docurl;
    private String commenturl;
    private int tienum;
    private String tlastid;
    private String tlink;
    private String label;
    private List<Keywords> keywords;
    private String time;
    private String newstype;
    private List<String> pics3;
    private String channelname;
    private String imgurl;
    private String add1;
    private String add2;
    private String add3;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }
    public String getDigest() {
        return digest;
    }

    public void setDocurl(String docurl) {
        this.docurl = docurl;
    }
    public String getDocurl() {
        return docurl;
    }

    public void setCommenturl(String commenturl) {
        this.commenturl = commenturl;
    }
    public String getCommenturl() {
        return commenturl;
    }

    public void setTienum(int tienum) {
        this.tienum = tienum;
    }
    public int getTienum() {
        return tienum;
    }

    public void setTlastid(String tlastid) {
        this.tlastid = tlastid;
    }
    public String getTlastid() {
        return tlastid;
    }

    public void setTlink(String tlink) {
        this.tlink = tlink;
    }
    public String getTlink() {
        return tlink;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String getLabel() {
        return label;
    }

    public void setKeywords(List<Keywords> keywords) {
        this.keywords = keywords;
    }
    public List<Keywords> getKeywords() {
        return keywords;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getTime() {
        return time;
    }

    public void setNewstype(String newstype) {
        this.newstype = newstype;
    }
    public String getNewstype() {
        return newstype;
    }

    public void setPics3(List<String> pics3) {
        this.pics3 = pics3;
    }
    public List<String> getPics3() {
        return pics3;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }
    public String getChannelname() {
        return channelname;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
    public String getImgurl() {
        return imgurl;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }
    public String getAdd1() {
        return add1;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }
    public String getAdd2() {
        return add2;
    }

    public void setAdd3(String add3) {
        this.add3 = add3;
    }
    public String getAdd3() {
        return add3;
    }
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

}