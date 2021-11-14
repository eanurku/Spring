package com.anurag.aop.advices;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class AdderAfterReturnAspect {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public void afterReturn(Object returnValue) {
        LOGGER.info("here is the return value ={}", returnValue);

    }

}
