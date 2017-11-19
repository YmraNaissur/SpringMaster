package com.naissur.section05.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section05.interfaces.Coach;

public class MyApp {
	public static void main(String[] args) {
		// load a spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("section05/applicationContext.xml");
		
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(myCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}