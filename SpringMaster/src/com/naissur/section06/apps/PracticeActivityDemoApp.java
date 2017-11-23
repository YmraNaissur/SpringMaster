package com.naissur.section06.apps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naissur.section06.interfaces.Coach;

public class PracticeActivityDemoApp {
	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("section06/applicationContext.xml");
		
		// retrieve singleton beans from spring container
		Coach myJavaCoachSingleton01 = context.getBean("myJavaCoachSingleton", Coach.class);
		Coach myJavaCoachSingleton02 = context.getBean("myJavaCoachSingleton", Coach.class);
		
		// check if they point to the same place in memory
		System.out.println("myJavaCoachSingleton01 == myJavaCoachSingleton02: " +
							(myJavaCoachSingleton01 == myJavaCoachSingleton02));
		System.out.println("Memory place of myJavaCoachSingleton01 is " + myJavaCoachSingleton01);
		System.out.println("Memory place of myJavaCoachSingleton02 is " + myJavaCoachSingleton02);
		
		// retrieve prototype beans from spring container
		Coach myJavaCoachPrototype01 = context.getBean("myJavaCoachPrototype", Coach.class);
		Coach myJavaCoachPrototype02 = context.getBean("myJavaCoachPrototype", Coach.class);
		
		// check if they point to the same place in memory
		System.out.println("myJavaCoachPrototype01 == myJavaCoachPrototype02: " +
							(myJavaCoachPrototype01 == myJavaCoachPrototype02));
		System.out.println("Memory place of myJavaCoachPrototype01 is " + myJavaCoachPrototype01);
		System.out.println("Memory place of myJavaCoachPrototype02 is " + myJavaCoachPrototype02);
		
		// close the context
		context.close();
	}
}