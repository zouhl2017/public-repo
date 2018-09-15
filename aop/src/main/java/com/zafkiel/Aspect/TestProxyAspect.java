package com.zafkiel.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestProxyAspect {
    @Pointcut("execution(* com.zafkiel.Proxy.TestProxy.*())")
    public void  pointcut(){}

    @Before("pointcut()")
    public  void  beforeAdvice(){
        //to do something
    }
}
