package com.wjw.complete5.mymongo.configuration;

/**
 * Author:JiawangWang
 *
 * @ Description:
 * @ Date: Create in 14:16 2018/1/23
 */
public enum Channels {
    TEMP(1,NewsConfiguration.URL_TEMP,NewsConfiguration.DATABASE_NAME,"temp"),               //要闻
    SPORTS(2,NewsConfiguration.URL_SPORTS,NewsConfiguration.DATABASE_NAME,"sports"),    //体育
    TRAVEL(3,NewsConfiguration.URL_TRAVEL,NewsConfiguration.DATABASE_NAME,"travel"),    //旅游
    TECH(4,NewsConfiguration.URL_TECH,NewsConfiguration.DATABASE_NAME,"technology"),           //科技
    ENT(5,NewsConfiguration.URL_ENT,NewsConfiguration.DATABASE_NAME,"entertainment"),            //娱乐
    LADY(6,NewsConfiguration.URL_LADY,NewsConfiguration.DATABASE_NAME,"lady"),           //女人
    MONEV(7,NewsConfiguration.URL_MONEY,NewsConfiguration.DATABASE_NAME,"money"),    //财经
    NBA(8,NewsConfiguration.URL_NBA,NewsConfiguration.DATABASE_NAME,"nba"),     //NBA
    MOBILE(9,NewsConfiguration.URL_MOBILE,NewsConfiguration.DATABASE_NAME,"mobile"),                 //手机
    DIgI(10,NewsConfiguration.URL_DIGI,NewsConfiguration.DATABASE_NAME,"digital"),                    //数码
    EDU(11,NewsConfiguration.URL_EDU,NewsConfiguration.DATABASE_NAME,"education"),         //教育
    ART(12,NewsConfiguration.URL_ART,NewsConfiguration.DATABASE_NAME,"art");           //艺术



    private int position;
    private String urlString;       //数据url
    private String databaseName;
    private String collectionName;

    Channels(int position, String urlString,String dataBaseName,String collectionName) {
        this.position = position;
        this.urlString = urlString;
        this.databaseName = dataBaseName;
        this.collectionName = collectionName;
    }

    public int getPosition() {
        return position;
    }

    public String getStr() {
        return urlString;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getCollectionName() {
        return collectionName;
    }


}
