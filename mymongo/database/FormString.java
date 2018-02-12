package com.wjw.complete5.mymongo.database;

import com.wjw.complete5.mymongo.configuration.StringProcessing;

/**
 * Author:JiawangWang
 *
 * @ Description:字符串提交到数据库之前的格式处理
 * 适合于表：Entertainment、HighLights、KeyWords、Lady、Mobile、Monev、Sports、Technology、Travel
 * @ Date: Create in 19:12 2018/1/23
 */
public class FormString {
    private static final String LADY_FORM_PREFIX = "{\"list\":";
    private static final String LADY_FORM_SUFFIX = "}";

    /**
     *
     * @param jsonString 经过字符串初步处理得到的JSON字符串
     * @return 加载成数据库可以使用的JSON格式字符串
     */
    public static String generateDatabaseTableFormat(String jsonString) {
        return jsonString != null ? LADY_FORM_PREFIX + jsonString + LADY_FORM_SUFFIX : null;
    }

    /**
     *
     * @param responseString 响应体字符串
     * @return 对得到返回的响应体字符串进行处理生成表提交格式的JSON字符串
     */
    static String stringProcessing(String responseString) {
        String jsonString = StringProcessing.stringToJSON(responseString);  //对非JSON字符串进行处理得到JSON字符串
        return FormString.generateDatabaseTableFormat(jsonString);   //与表中的JSON格式进行对应
    }
}
