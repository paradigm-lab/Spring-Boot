package com.SpringFramework;


import org.springframework.stereotype.Component;

@Component("shoppingcart")
public class ShoppingCart {

    public void checkout() {
        System.out.println("Checkout Method from ShoppingCart Called");
    }
}
