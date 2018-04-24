package com.newer.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Aspect
@Service("logAspect")
public class LogAdpect {

    @Pointcut("execution(* com.newer.service.*.*(..))")
    public void anyMethod(){

    }

    @Before("anyMethod()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法的前置通知");
    }

    @AfterReturning("anyMethod()")
    public void afterMethod(){
        System.out.println("后置通知");
    }


//    public void afterThrowing(Exception e)throws Throwable{
//        System.out.println("异常通知");
//    }
    @After("anyMethod()")
    public void finalMethod(){
        System.out.println("最终通知");
    }

    @Around("anyMethod()")
    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕通知");
        return proceedingJoinPoint.proceed();
    }
}
