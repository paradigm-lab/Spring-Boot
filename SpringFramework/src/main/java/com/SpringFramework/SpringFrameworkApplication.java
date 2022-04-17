package com.SpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkApplication {

	public static void main(String[] args) {

		ApplicationContext contex = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans file is loaded");

		Staff staff = contex.getBean(Nurse.class);
		staff.assist();
	}

}
