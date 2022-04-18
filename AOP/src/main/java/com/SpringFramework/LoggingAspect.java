package com.SpringFramework;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Defining a Pointcut and the pattern to match the JointPoint

    // Pointcut
    @Before("execution(* com.SpringFramework.ShoppingCart.checkout(..))")
    public void beforeLogger() {
        System.out.println("Before Logger");
    }

    @After("execution(* com.SpringFramework.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After Logger");
    }

}
