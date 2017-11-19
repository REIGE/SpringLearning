package com.reige.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by REIGE on 2017/11/19.
 */
@Aspect
@Component
public class AdviceAspect {

    //pointcut
    @Pointcut("@annotation(com.reige.aop.annotation.AdminOnly) && within(com.reige.aop..*)")
    public void matchAnno() {
    }

    @Pointcut("execution(* *..find*(Long)) && within(com.reige.aop.service..*)")
    public void matchLongArg() {
    }

    @Pointcut("execution(public * com.reige.aop.service..*Service.*(..) throws java.lang.IllegalAccessException) && within(com.reige.aop..*)")
    public void matchException() {
    }

    @Pointcut("execution(String com.reige..*.*(..)) && within(com.reige.aop..*)")
    public void matchReturn() {
    }

    //advice
//    @After("matchAnno()")

    //    @After("matchException()") //抛出异常执行
//    @AfterThrowing("matchException()")//抛出异常情况下执行
    @AfterReturning(value = "matchReturn()", returning = "result")//匹配返回值
    public void after(Object result) {
        if (result != null) {
            System.out.println("AdviceAspect: after" + result);
        } else {
            System.out.println("AdviceAspect: after");
        }
    }

    @Around(value = "matchAnno()")
    public Object around(ProceedingJoinPoint joinPoint) {
        System.out.println("around before");
        Object result = null;
        try {
            result = joinPoint.proceed(joinPoint.getArgs());
        } catch (Throwable throwable) {
            System.out.println("around exception");
            throwable.printStackTrace();
        } finally {
            System.out.println("around finally");
        }
        return result;
    }


}
