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
public class ObjectAspect {

    @Pointcut("bean(logService)")
    public void matchCondition(){}

    @Before("matchCondition()")
    private void objectAspectBefore(){
        System.out.println("objectAspect: Before");
    }
}
