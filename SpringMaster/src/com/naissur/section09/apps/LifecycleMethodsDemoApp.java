package com.naissur.section09.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section09.interfaces.Coach;

public class LifecycleMethodsDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section09/applicationContext.xml");
		
		// retrieve bean from spring container
		Coach myJavaCoach = context.getBean("javaCoach", Coach.class);
		
		// call bean method
		System.out.println(myJavaCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}