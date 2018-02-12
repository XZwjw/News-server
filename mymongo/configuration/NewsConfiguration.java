package com.wjw.complete5.mymongo.configuration;

/**
 * Author:JiawangWang
 *
 * @Description:
 * @Date: Create in 10:36 2018/1/23
 */
public class NewsConfiguration {
    private static final String PRE_FIX_URL = "http://";
    private static final String SUFFIX_URL = "?callback=data_callback";
    static final String RESPONSE_HEAD_STRING = "data_callback(";    //非正常JSON字符串的头部

    static final String DATABASE_NAME = "news2";
    static final String URL_TEMP = "temp.163.com/special/00804KVA/cm_yaowen.js";
    static final String URL_SPORTS = "sports.163.com/special/000587PR/newsdata_n_index.js";
    static final String URL_TRAVEL = "travel.163.com/special/00067VEJ/newsdatas_travel.js";
    static final String URL_TECH = "tech.163.com/special/00097UHL/tech_datalist.js";
    static final String URL_ENT = "ent.163.com/special/000380VU/newsdata_index.js";
    static final String URL_LADY = "lady.163.com/special/00264OOD/data_nd_sense.js";
    static final String URL_MONEY = "money.163.com/special/002557S5/newsdata_idx_index.js";
    static final String URL_NBA = "sports.163.com/special/000587PK/newsdata_nba_index.js";
    static final String URL_MOBILE = "mobile.163.com/special/index_datalist/";
    static final String URL_DIGI = "digi.163.com/special/index_datalist/";
    static final String URL_EDU = "edu.163.com/special/002987KB/newsdata_edu_hot.js";
    static final String URL_ART = "art.163.com/special/00999815/art_redian_api.js";
    public static long NEWS_UPDATE_INTERVAL_DEFAULT = 1000 * 60 * 60 * 24;   //每天更新一次
    public static final String RESPONSE_CHARSET = "gbk";

    public static String getBaseUrl(Channels channel) {
        return PRE_FIX_URL + channel.getStr() + SUFFIX_URL;
    }

    /**
     * @param configuration 配置，更多消息配置文件
     * @param channel   频道
     * @return  获取更多消息的url1,url2,...
     */
    public static String getMoreNewsUrl(MoreConfiguration configuration,Channels channel) {
        String string = channel.getStr();
        if(string.endsWith(".js")) {
            string =  PRE_FIX_URL + string.substring(0,string.length()-3)+configuration.getSuffixString()+string.substring(string.length()-3,string.length()) + SUFFIX_URL;
        } else {
            string =  PRE_FIX_URL + string.substring(0,string.length()-1)+configuration.getSuffixString()+string.substring(string.length()-1,string.length()) + SUFFIX_URL;
        }
        return string;
    }
}
