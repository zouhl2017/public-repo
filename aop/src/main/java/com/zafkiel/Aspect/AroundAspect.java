package com.zafkiel.Aspect;

import com.zafkiel.POJO.AroundServiceReqVO;
import com.zafkiel.POJO.AroundServiceRspVO;
import com.zafkiel.Utils.AopTargetUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

    @Pointcut("execution(* com.zafkiel.Service.IAroundService.*(*,String,*))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---------------------");
        System.out.println("执行目标方法前");
        Object proxy = AopContext.currentProxy();
        System.out.println("proxy:" + proxy.getClass().getName());
        System.out.println("proxy:" + proxy);
        Object target= AopTargetUtils.getCglibProxyTargetObject(proxy);
        System.out.println("target:"+target.getClass().getName());
        System.out.println("target:"+target);
        System.out.println(proxy==target);
        System.out.println(proxy.equals(target));
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object returnType = methodSignature.getReturnType();
        System.out.println("methodSignature:" + methodSignature.toString());
        System.out.println("目标对象:" + joinPoint.getTarget());
        System.out.println("目标方法:" + methodSignature.getDeclaringTypeName() + "." + methodSignature.getName());
        Object[] args = joinPoint.getArgs();
        if (null != args && args.length > 0) {
            if (args[0] instanceof AroundServiceReqVO) {
                AroundServiceReqVO arg0 = (AroundServiceReqVO) args[0];
                System.out.println("入参0：" + arg0);
                System.out.println("arg0.nero:" + arg0.getNero());
                System.out.println("arg0.saber:" + arg0.getSaber());
            }
            if (args[1] instanceof String) {
                System.out.println("入参1:" + (String) args[1]);
                System.out.println("我将会改变入参1,改变为:" + "homula");
                args[1] = "homula";
            }
            if (args[2] instanceof Integer) {
                System.out.println("入参2:" + (Integer) args[2]);
            }
        }
        System.out.println("---------------------");

        System.out.println("开始执行目标方法");
        Object returnValue = joinPoint.proceed(args);
        System.out.println("执行目标方法结束");
        System.out.println("---------------------");

        System.out.println("改变参数1后执行返回的结果为：" + returnValue.toString());
        AroundServiceRspVO returnObject = (AroundServiceRspVO) returnValue;
        System.out.println("returnObject.alterNero:" + returnObject.getAlterNero());
        System.out.println("returnObject.alterSaber:" + returnObject.getAlterSaber());
        System.out.println("---------------------");
    }
}
