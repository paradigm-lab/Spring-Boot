package com.SpringFramework;


import org.springframework.stereotype.Component;

@Component("shoppingcart")
public class ShoppingCart {

    public void checkout(String  status) {
        // Logging (JoinPoint)
        // Authentication & Authorization
        // Sanitize the Data (Sanitization)
        System.out.println("Checkout Method from ShoppingCart Called");
    }
}
