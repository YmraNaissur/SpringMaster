package com.naissur.section07.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section07.interfaces.Coach;

public class PracticeActivityDemoApp {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section07/applicationContext.xml");
		
		// retrieve bean from the container
		Coach myBasketballCoach = context.getBean("basketballCoach", Coach.class);
		
		// call bean method(s)
		System.out.println(myBasketballCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}