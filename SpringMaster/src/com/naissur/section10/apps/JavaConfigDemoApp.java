package com.naissur.section10.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naissur.section10.config.SportConfig;
import com.naissur.section10.interfaces.Coach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// load spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach myTennisCoach = context.getBean("tennisCoach", Coach.class);
		
		// call bean method
		System.out.println(myTennisCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}