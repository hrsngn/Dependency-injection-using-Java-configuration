package com.example.plainspring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyBeanAspect {

    @Pointcut("execution(* com.example.plainspring.service.ServiceOne.findTheString(..))")
    public void thePointCut(){}

    @Before("execution(* com.example.plainspring.service.ServiceOne.findTheString(..))")
    public void beforeFindTheString(JoinPoint jp){
        System.out.println(jp.getSignature());
        System.out.println("BEFORE findTheString()");
    }

    @After("thePointCut()")
    public void afterFindTheString(){
        System.out.println("AFTER findTheString()");
    }

    @Around("thePointCut()")
    public void aroundFindTheString(ProceedingJoinPoint joinPoint){
        System.out.println("AROUND: BEFORE findthestring()");
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("AROUND: AFTER findthestring()");
    }
}
