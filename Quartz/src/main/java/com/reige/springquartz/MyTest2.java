package com.reige.springquartz;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by REIGE on 2017/11/5.
 */
@Component("myTest2")
public class MyTest2 {
    public void testMethod(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("MyTest2---->testMethod"+format.format(date));
    }
}
