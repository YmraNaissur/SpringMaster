package com.naissur.section08.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section08.impl.coach.SwimCoach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("section08/applicationContext.xml");
		
		// get the bean(s) from spring container
		// Coach myTennisCoach = context.getBean("tennisCoach", Coach.class);
		// Coach myBikeCoach = context.getBean("bikeCoach", Coach.class);
		// Coach myJavaCoach = context.getBean("javaCoach", Coach.class);
		SwimCoach mySwimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method(s) on the bean(s)
		// System.out.println(myTennisCoach.getDailyWorkout());
		// System.out.println(myBikeCoach.getDailyWorkout());
		// System.out.println(myJavaCoach.getDailyWorkout());
		System.out.println(mySwimCoach.getEmail());
		System.out.println(mySwimCoach.getTeam());
		
		// call method(s) to get the daily fortune(s)
		// System.out.println(myTennisCoach.getDailyFortune());
		// System.out.println(myBikeCoach.getDailyFortune());
		// System.out.println(myJavaCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
