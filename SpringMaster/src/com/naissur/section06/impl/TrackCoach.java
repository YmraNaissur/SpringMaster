package com.naissur.section06.impl;

import com.naissur.section06.interfaces.Coach;
import com.naissur.section06.interfaces.FortuneService;

public class TrackCoach implements Coach {
	// dependency
	private FortuneService fortuneService;

	// no-arg constructor
	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor.");
	}
	
	// create constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach: inside constructor for dependency injection.");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrachCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
