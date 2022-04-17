package com.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans file is loaded");

		Doctor doctor = context.getBean("doctor", Doctor.class);
		doctor.assist();
	}

}
