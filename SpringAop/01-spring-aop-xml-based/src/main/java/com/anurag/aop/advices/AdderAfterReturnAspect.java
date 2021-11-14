package com.anurag.aop.advices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdderAfterReturnAspect {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public void afterReturn(Object returnValue) {
        LOGGER.info("here is the return value ={}", returnValue);

    }

}
