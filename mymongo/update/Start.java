package com.wjw.complete5.mymongo.update;

import com.wjw.complete5.mymongo.database.CollectionOperation;
import com.wjw.complete5.mymongo.database.ICollectionOperation;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 12:10 2018/1/24
 */
public class Start {
    private ICollectionOperation mDatabaseOperation = new CollectionOperation();
    /**
     * 测试入口方法
     */
    public void start() {
        regularlyUpdated();     //定时更新
        updateDatabase();       //立即更新
    }

    /**
     * 每个频道的数据增加一条
     */
    private void addDatabase() {
        mDatabaseOperation.addAllCollection();
    }

    private void updateDatabase() {
        mDatabaseOperation.updateAllCollection();
    }

    private void regularlyUpdated() {
        mDatabaseOperation.regularlyUpdated();
    }

}
