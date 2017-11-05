package com.reige.springquartz;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Created by REIGE on 2017/11/5.
 */
public class MyScheduledJob extends QuartzJobBean {

    private MyTest2 myTest2;

    public void setMyTest2(MyTest2 myTest2) {
        this.myTest2 = myTest2;
    }

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        myTest2.testMethod();
    }

}
