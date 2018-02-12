package com.wjw.complete5.mymongo.configuration;


/**
 * Author:JiawangWang
 *
 * @ Description: 字符串处理类
 * @ Date: Create in 17:53 2018/1/23
 */
public class StringProcessing {
    private static final String RESPONSE_PREFIX  = NewsConfiguration.RESPONSE_HEAD_STRING;
    /**
     * 有待改善
     * @param responseString 响应体字符串
     * @return 去除响应体多余字符串得到Json格式的字符串
     */
    public static String stringToJSON(String responseString) {
        if (responseString == null) {
            return null;
        }
        while(responseString.startsWith(" ")) {
            responseString = responseString.substring(1);
        }
        if(responseString.contains(RESPONSE_PREFIX)) {
            return responseString.substring(RESPONSE_PREFIX.length(),responseString.length()-1);    //去除非正常JSON字符串最后部分的')'
        }
        return null;

    }



}
