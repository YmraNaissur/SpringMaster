package com.naissur.section04;

public class MyApp {
	public static void main(String[] args) {
		// create the object
		Coach theCoach = new BaseballCoach();
		// Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}