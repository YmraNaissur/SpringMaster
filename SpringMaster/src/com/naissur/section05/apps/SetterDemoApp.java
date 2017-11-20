package com.naissur.section05.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section05.interfaces.Coach;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section05/applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCricketCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}