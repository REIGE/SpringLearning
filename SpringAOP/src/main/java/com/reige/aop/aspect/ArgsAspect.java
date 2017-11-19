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
public class ArgsAspect {

//    @Pointcut("args(Long) && within(com.reige.aop.service.*)")

    // 匹配第一个参数为Long
    @Pointcut("args(Long,..) && within(com.reige.aop.service.*)")
    public void matchArgs(){}

    @Before("matchArgs()")
    public void argsAspectBefore(){
        System.out.println("ArgsAspect: Before");
    }
}
