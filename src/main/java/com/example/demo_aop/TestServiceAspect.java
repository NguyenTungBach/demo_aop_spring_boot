package com.example.demo_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TestServiceAspect {
    private Logger logger = LoggerFactory.getLogger(TestServiceAspect.class);

    @Before("execution(* com.example.demo_aop.service.*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info(" before chạy trược method " + joinPoint.toString());
    }

    @After("execution(* com.example.demo_aop.service.*.*(..))")
    public void after(JoinPoint joinPoint){
        logger.info(" After chạy trong 2 trường hợp method chạy thành công hay có exception called " + joinPoint.toString());
    }

    @AfterReturning("execution(* com.example.demo_aop.service.*.*(..))")
    public void afterReturning(JoinPoint joinPoint){
        logger.info(" AfterReturning Chạy khi method chạy thành công " + joinPoint.toString());
    }

    @AfterThrowing("execution(* com.example.demo_aop.service.*.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        logger.info(" AfterThrowing Chạy khi method có exception " + joinPoint.toString());
    }
}
