package com.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkApplication {

	public static void main(String[] args) {

		// Configuring the beans in xml approach
		// ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// System.out.println("Beans file is loaded");

		// Configuring the beans in java based approach
		ApplicationContext  context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Doctor doctor = context.getBean(Doctor.class);
		doctor.assist();

	}

}
