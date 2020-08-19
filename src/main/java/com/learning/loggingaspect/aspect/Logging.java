package com.learning.loggingaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

    /** Advice will be called
     *  for all the methods which locate in service.
     */

    @Pointcut("execution(* com.learning.loggingaspect.service.impl.*.*(..))")
    private void selectAll() {}


    /**
     * This is the method which I would like to execute
     * before a selected method execution.
     */

    @Before("selectAll()")
    private void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }


    /**
     * This is the method which I would like to execute
     * after a selected method execution.
     */

    @After("selectAll()")
    private void afterAdvice(){
        System.out.println("Student profile has been setup.");
    }

    /**
     * This is the method which I would like to execute
     * when any method returns.
     */

    @AfterReturning(pointcut = "selectAll()", returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning: "+ retVal.toString());
    }

    /**
     * This is the method which I would like to execute
     * if there is an exception raised by any method.
     */

    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("There has been an exception: " + ex.toString());
    }
}
