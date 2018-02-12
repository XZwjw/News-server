package com.wjw.complete5.mymongo.database;
import com.wjw.complete5.mymongo.configuration.NewsConfiguration;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Author:JiawangWang
 *
 * @ Description:    每天凌晨更新数据库
 * @ Date: Create in 17:48 2018/1/25
 */
public class MyTask {
    private static long interval = NewsConfiguration.NEWS_UPDATE_INTERVAL_DEFAULT;   //间隔时间
    private IConstantlyUpdate iConstantlyUpdate;
    public MyTask(IConstantlyUpdate iConstantlyUpdate) {
        this.iConstantlyUpdate = iConstantlyUpdate;
    }
    void startTask() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                iConstantlyUpdate.doSomething();

            }
        };
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        Date date  = calendar.getTime();
        if(date.before(new Date())) {
            date = addDay(date,1);
        }

        timer.schedule(task,date,interval);
    }

    /**
     * 增加天数
     * @param date 日期
     * @param num 需要增加的天数
     * @return  返回真正要开始的日期
     */
    private Date addDay(Date date, int num) {
        Calendar realCalender = Calendar.getInstance();
        realCalender.setTime(date);
        realCalender.add(Calendar.DAY_OF_MONTH,num);
        return realCalender.getTime();
    }
}
