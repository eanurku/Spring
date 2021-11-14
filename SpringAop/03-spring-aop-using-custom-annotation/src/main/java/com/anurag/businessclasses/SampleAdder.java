package com.anurag.businessclasses;

import com.anurag.aop.custom.EnableExecutionTimeCalc;
import org.springframework.stereotype.Component;

@Component
public class SampleAdder {

    @EnableExecutionTimeCalc
    public int add(int a, int b) {
        return a + b;
    }
}
