package com.SpringFramework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFrameworkApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("The Beans Configuration file is loaded");

		ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingcart");
		shoppingCart.checkout();

	}

}
