package com.wjw.complete5.mymongo.configuration;

/**
 * Author:JiawangWang
 *
 * @ Description: 更多消息的配置文件（除了频道的url中的数据的其他数据存放url：url1,url2,...）
 *  _01,_02,...后缀
 * @ Date: Create in 15:49 2018/1/25
 */
public enum MoreConfiguration {
    SUFFIX_1("_02"),
    SUFFIX_2("_03"),
    SUFFIX_3("_04"),
    SUFFIX_4("_05"),
    SUFFIX_5("_06"),
    SUFFIX_6("_07"),
    SUFFIX_7("_08"),
    SUFFIX_8("_09");

    private String suffixString;

    MoreConfiguration(String string) {
        this.suffixString =string;
    }

    public String getSuffixString() {
        return suffixString;
    }
}
