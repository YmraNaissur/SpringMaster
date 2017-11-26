package com.naissur.section07.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section07.interfaces.Coach;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section07/applicationContext.xml");
		
		// retrieve beans from the container
		Coach myTennisCoach = context.getBean("thatSillyCoach", Coach.class);
		Coach myJavaCoach = context.getBean("javaCoach", Coach.class);
		
		// call bean method(s)
		System.out.println(myTennisCoach.getDailyWorkout());
		System.out.println(myJavaCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
}