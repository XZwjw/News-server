package com.wjw.complete5.mymongo.util;

import com.wjw.complete5.mymongo.configuration.NewsConfiguration;
import okhttp3.*;


import java.io.IOException;

/**
 * Author:JiawangWang
 *
 * @ Description:网络请求操作
 * @ Date: Create in 16:25 2018/1/23
 */
public class RequestOperation {

    public static String getResponse(String url) {

        return getResponse(url, NewsConfiguration.RESPONSE_CHARSET);
    }

    /**
     *
     * @param url 请求url
     * @return 根据url获得响应体字符串
     */
    public static String getResponse(String url,String charset) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        Call call = client.newCall(request);
        try {

            Response response = call.execute();
            byte[] responseBytes = response.body().bytes();
            return new String(responseBytes,charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
