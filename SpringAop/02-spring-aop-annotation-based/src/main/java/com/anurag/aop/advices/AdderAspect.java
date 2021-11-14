package com.anurag.aop.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdderAspect {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    @Pointcut("execution(* com.anurag.businessclasses.SampleAdder+.*(..))")
    public void adderPointcut() {
    }

    @AfterReturning(pointcut = "adderPointcut()", returning = "returnValue")
    public void afterReturn(JoinPoint joinpoint, Object returnValue) {
        LOGGER.info("joinpoint ={}", joinpoint.getSignature().getName());
        LOGGER.info("afterReturn method return value ={}", returnValue);
    }

}
