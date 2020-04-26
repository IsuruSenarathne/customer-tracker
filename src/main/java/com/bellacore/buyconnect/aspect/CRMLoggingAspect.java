package com.bellacore.buyconnect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

@Aspect
@Component
public class CRMLoggingAspect {
    //setup logger
    private Logger logger = Logger.getLogger(getClass().getName());
    //setup point cut
    @Pointcut("execution(* com.bellacore.buyconnect.controller.*.*(..))")
    private void forControllerPackage(){}

    @Pointcut("execution(* com.bellacore.buyconnect.service.*.*(..))")
    private void forServicePackage(){}

    @Pointcut("execution(* com.bellacore.buyconnect.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow(){}

    //add before@ advice
    @Before("forAppFlow()")
    public void before(JoinPoint joinPoint){
        // display method we calling
        String method = joinPoint.getSignature().toShortString();
        logger.info("======>> in @Before: calling method: " + method);

        // get args passed joinPoint
        Object[] args = joinPoint.getArgs();

        for (Object arg: args){
            logger.info(">>>>>>> passed arg value: " + arg);
        }

    }

    //add @After advice
}
