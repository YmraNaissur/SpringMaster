package com.naissur.section10.apps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naissur.section10.config.MusicConfig;
import com.naissur.section10.interfaces.Coach;

public class PracticeActivityDemoApp {
	public static void main(String[] args) {
		// load spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MusicConfig.class);
		
		// retrieve bean from the container
		Coach myGuitarCoach = context.getBean("guitarCoach", Coach.class);
		
		// call bean methods
		System.out.println(myGuitarCoach.getDailyWorkout());
		System.out.println(myGuitarCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}