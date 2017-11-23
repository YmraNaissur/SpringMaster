package com.naissur.section06.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section06.interfaces.Coach;

public class BeanLifecycleDemoApp {
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section06/applicationContext.xml");
		
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);		
		
		// call bean method(s)
		System.out.println(myCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}