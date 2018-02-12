package com.wjw.complete5.mymongo.database;

import com.wjw.complete5.mymongo.configuration.Channels;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 16:11 2018/1/24
 */
public interface ICollectionOperation {

    //对所有频道进行操作
    void updateAllCollection();
    void dropAllCollection();
    void addAllCollection();
    void findAllCollection();

    //对单个频道进行操作
    void updateToCollection(Channels channel);
    void dropToCollection(Channels channel);
    void addToCollection(Channels channel);
    void findToCollection(Channels channel);

    void constantlyUpdate(int intervals);   //每隔一段时间进行更新
    void regularlyUpdated();                  //0点更新数据库
}
