package com.SpringFramework;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Defining a Pointcut and the pattern to match the JointPoint

    // Pointcut
    @Before("execution(* com.SpringFramework.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        System.out.println(jp.getSignature());
        System.out.println(jp.getArgs()[0].toString());
        System.out.println("Before Logger");
    }

    @After("execution(* com.SpringFramework.ShoppingCart.checkout(..))")
    public void afterLogger() {
        System.out.println("After Logger");
    }

    // Defining a Pointcut
    @Pointcut("execution(* com.SpringFramework.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("After Returning: " + retVal);
    }

}
