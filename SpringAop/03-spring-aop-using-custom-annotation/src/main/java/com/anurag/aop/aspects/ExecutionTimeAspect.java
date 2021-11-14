package com.anurag.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class ExecutionTimeAspect {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Around("@annotation(com.anurag.aop.custom.EnableExecutionTimeCalc)")
    public Object logExecutionTimeOfMethod(ProceedingJoinPoint joinpoint) throws Throwable {

        StopWatch stopWatch = new StopWatch(joinpoint.getSignature().getName());

        stopWatch.start(joinpoint.getSignature().getName());
        Object returnvalue = joinpoint.proceed();
        stopWatch.stop();

        LOGGER.info(stopWatch.prettyPrint());


        return returnvalue;
    }
}
