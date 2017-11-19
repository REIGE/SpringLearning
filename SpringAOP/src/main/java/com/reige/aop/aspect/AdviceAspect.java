package com.reige.aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by REIGE on 2017/11/19.
 */
@Aspect
@Component
public class AdviceAspect {

    //pointcut
    @Pointcut("@annotation(com.reige.aop.annotation.AdminOnly) && within(com.reige.aop..*)")
    public void matchAnno(){}

    @Pointcut("execution(* *..find*(Long)) && within(com.reige.aop.service..*)")
    public void matchLongArg(){}

    @Pointcut("execution(public * com.reige.aop.service..*Service.*(..) throws java.lang.IllegalAccessException) && within(com.reige.aop..*)")
    public void matchException(){}

    @Pointcut("execution(String com.reige..*.*(..)) && within(com.reige.aop..*)")
    public void matchReturn(){}

    //advice
//    @After("matchAnno()")

//    @After("matchException()") //抛出异常执行
//    @AfterThrowing("matchException()")//抛出异常情况下执行
    @AfterReturning(value = "matchReturn()",returning = "result")//匹配返回值
    public void after(Object result){
        if (result != null){
            System.out.println("AdviceAspect: after"+result);
        }else {
            System.out.println("AdviceAspect: after");
        }

    }


}
