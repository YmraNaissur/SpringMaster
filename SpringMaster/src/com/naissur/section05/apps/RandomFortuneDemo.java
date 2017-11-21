package com.naissur.section05.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section05.interfaces.Coach;

public class RandomFortuneDemo {

	public static void main(String[] args) {
		// create a spring container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section05/applicationContext.xml");
		
		// retrieve myJavaCoach bean from spring container
		Coach myJavaCoach = context.getBean("myJavaCoach", Coach.class);
		
		// use bean method(s)
		System.out.println(myJavaCoach.getDailyWorkout());
		System.out.println(myJavaCoach.getDailyFortune());	
		
		// close the context
		context.close();
	}
}