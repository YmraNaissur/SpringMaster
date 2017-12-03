package com.naissur.section10.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naissur.section10.config.SportConfig;
import com.naissur.section10.interfaces.Coach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// load spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach mySwimCoach = context.getBean("swimCoach", Coach.class);
		
		// call bean methods
		System.out.println(mySwimCoach.getDailyWorkout());
		System.out.println(mySwimCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}