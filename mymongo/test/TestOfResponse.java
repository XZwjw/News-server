package com.wjw.complete5.mymongo.test;

import com.wjw.complete5.mymongo.configuration.Channels;
import com.wjw.complete5.mymongo.configuration.NewsConfiguration;
import com.wjw.complete5.mymongo.configuration.StringProcessing;
import com.wjw.complete5.mymongo.util.RequestOperation;
import org.apache.log4j.Logger;


/**
 * Author:JiawangWang
 *
 * @ Description:测试类：测试url响应体
 * @ Date: Create in 16:36 2018/1/23
 */
public class TestOfResponse {
    private Logger logger = Logger.getLogger(TestOfResponse.class);
    /**
     * 测试类启动接口
     */
    public void start()  {
        startTest();
    }

    /**
     * 开始测试，这里以频道"要闻"为例
     */
    private void startTest() {
//        responseSuccessTest(Channels.TEMP);
        responseStringToJson(Channels.TEMP);
    }


    /**
     * 响应体字符串返回是否成功测试
     */
    private void responseSuccessTest(Channels channels) {
        logger.info(RequestOperation.getResponse(NewsConfiguration.getBaseUrl(channels)));
    }

    /**
     * 响应体字符串转换为JSON格式字符串测试
     * @param channels
     */
    private void responseStringToJson(Channels channels) {
//        logger.info(StringProcessing.stringToJSON(RequestOperation.getResponse(NewsUrl.getBaseUrl(channels))));
        logger.info(StringProcessing.stringToJSON("叫爸爸"));

    }

}
