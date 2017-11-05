package com.reige.springquartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by REIGE on 2017/11/5.
 */
public class ScheduledJobTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
    }
}