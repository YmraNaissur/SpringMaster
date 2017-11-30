package com.naissur.section08.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section08.interfaces.Coach;

public class PracticeActivityDemoApp {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section08/applicationContext.xml");
		
		// retrieve bean from the container
		Coach myJavaCoach = context.getBean("javaCoach", Coach.class);
		
		// call bean method(s)
		System.out.println(myJavaCoach.getDailyWorkout());
		System.out.println(myJavaCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}