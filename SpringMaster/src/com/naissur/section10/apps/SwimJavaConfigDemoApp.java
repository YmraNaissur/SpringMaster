package com.naissur.section10.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naissur.section10.config.SportConfig;
import com.naissur.section10.impl.coach.SwimCoach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// load spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		SwimCoach mySwimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call bean methods
		System.out.println(mySwimCoach.getDailyWorkout());
		System.out.println(mySwimCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
		System.out.println("Email: " + mySwimCoach.getEmail());
		System.out.println("Team: " + mySwimCoach.getTeam());
		
		// close the context
		context.close();
	}
}