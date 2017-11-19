package com.reige.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by REIGE on 2017/11/19.
 */
@Aspect
@Component
public class PkgTypeAspect {

//  @Pointcut("within(com.reige.aop.service.AdminService)")
    @Pointcut("within(com.reige.aop.service.*)")
    public void matchType(){

    }

    @Before("matchType()")
    public void before(){
        System.out.println("before");
    }
}
