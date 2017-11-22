package com.naissur.section06.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section06.interfaces.Coach;

public class PrototypeDemoApp {
	public static void main(String[] args) {
		// load spring context
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section06/applicationContext.xml");
		
		// retrieve beans from the context
		Coach myCoach01 = context.getBean("myCoach", Coach.class);
		Coach myCoach02 = context.getBean("myCoach", Coach.class);
		
		// check if they are the same
		boolean result = (myCoach01 == myCoach02);
		
		// print out the result
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory location for myCoach01: " + myCoach01);
		System.out.println("Memory location for myCoach02: " + myCoach02);
		
		// close the context
		context.close();
	}
}