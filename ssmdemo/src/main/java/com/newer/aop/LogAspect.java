package com.newer.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Aspect
@Service("logAspect")
public class LogAspect {
    @Pointcut("execution(* com.newer.service.*.*(..))")
    public void anyMethod(){

    }
    @Before("anyMethod()")
    public void before(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"前置通知");
    }

    @AfterReturning("anyMethod()")
    public void after(){
        System.out.println("后置通知");
    }

    @After("anyMethod()")
    public void finalMethod(){
        System.out.println("最终通知");
    }

    @Around("anyMethod()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("环绕通知");
      return pjp.proceed();
    }

}
