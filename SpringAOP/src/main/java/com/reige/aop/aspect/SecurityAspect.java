package com.reige.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by REIGE on 2017/11/18.
 */
@Aspect
@Component
public class SecurityAspect {

    @Pointcut("@annotation(com.reige.aop.annotation.AdminOnly)")
    public void adminOnly() {
    }

    @Before("adminOnly()")
    public void check() {
        System.out.println("这个方法只允许管理员调用");
    }
}
