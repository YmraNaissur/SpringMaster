package com.naissur.section09.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section09.interfaces.Coach;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section09/applicationContext.xml");
		
		// retrieve beans from the container
		// first singleton beans
		Coach alphaJavaCoach = context.getBean("javaCoach", Coach.class);
		Coach betaJavaCoach = context.getBean("javaCoach", Coach.class);
		
		// then prototype beans
		Coach alphaTennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach betaTennisCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same or not
		boolean javaCoachResult = (alphaJavaCoach == betaJavaCoach);
		boolean tennisCoachResult = (alphaTennisCoach == betaTennisCoach);
		
		// print out the results
		System.out.println("alphaJavaCoach and betaJavaCoach are pointing "
				+ "to the same object: " + javaCoachResult);
		System.out.println("Memory location for alphaJavaCoach: " + alphaJavaCoach);
		System.out.println("Memory location for betaJavaCoach: " + betaJavaCoach);
		
		System.out.println("alphaTennisCoach and betaTennisCoach are pointing "
				+ "to the same object: " + tennisCoachResult);
		System.out.println("Memory location for alphaTennisCoach: " + alphaTennisCoach);
		System.out.println("Memory location for betaTennisCoach: " + betaTennisCoach);
		
		// close the context
		context.close();
	}
}