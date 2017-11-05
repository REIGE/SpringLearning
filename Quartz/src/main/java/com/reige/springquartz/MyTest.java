package com.reige.springquartz;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by REIGE on 2017/11/5.
 */
@Component("myTest")
public class MyTest {

    public void testMethod(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("MyTest---->testMethod"+format.format(date));
    }
}
