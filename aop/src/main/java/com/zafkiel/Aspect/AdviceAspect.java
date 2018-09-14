package com.zafkiel.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdviceAspect  {

    @Pointcut(value = "execution(* com.zafkiel.Service.impl.MyServiceImpl.*())")
    public  void  aspect(){
    }

    /**
     * apple
     * 前置通知
     * @param joinPoint
     */
    @Before("aspect()")
    public  void  beforeAdvice(JoinPoint joinPoint){
        System.out.println("beforeAdvice ");
        System.out.println("bofore :"+joinPoint);
    }

    /**
     * banana
     * 后置通知
     * @param joinPoint
     */
    @After("execution(* com.zafkiel.Service.IMyService.banana())")
    public  void  afterAdvice(JoinPoint joinPoint){
        System.out.println("afterAdvice ");
        System.out.println("after :"+joinPoint);
    }

    /**
     * grape
     * 环绕通知
     * @param joinPoint
     */
    @Around("execution(* com.zafkiel.Service.IMyService.grape())")
    public  void  aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundAdvice ");
        joinPoint.proceed();
        System.out.println("around :"+joinPoint);
    }

    /**
     * pineapple
     * 后置返回通知
     * @param joinPoint
     */
    @AfterReturning("execution(* com.zafkiel.Service.IMyService.pineapple())")
    public void afterReturnAdvice(JoinPoint joinPoint){
        System.out.println("afterReturnAdvice ");
        System.out.println("afterReturn");
    }

    /**
     * mango
     * 抛出异常后通知
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "execution(* com.zafkiel.Service.IMyService.mango())", throwing="e")
    public void afterThrowAdvice(JoinPoint joinPoint, Exception e){
            System.out.println("afterThrowAdvice" + joinPoint + "\t" + e.getMessage());
            System.out.println("afterThrow");
    }


}
