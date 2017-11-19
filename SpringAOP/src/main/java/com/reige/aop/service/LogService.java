package com.reige.aop.service;

import org.springframework.stereotype.Service;

/**
 * Created by REIGE on 2017/11/19.
 */
@Service
public class LogService {

    public void printLog(){
        System.out.println("LogService: print log");
    }

    public String printLog(Long num){
        String s= "LogService: print log-->"+num;
        System.out.println("LogService: print log-->"+num);
        return s;
    }
}
