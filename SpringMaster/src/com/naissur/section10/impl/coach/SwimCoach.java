package com.naissur.section10.impl.coach;

import com.naissur.section10.interfaces.Coach;
import com.naissur.section10.interfaces.FortuneService;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	// default constructor
	public SwimCoach() {
		System.out.println(">> SwimCoach: inside default constructor.");
	}
	
	// constructor to inject the dependency
	public SwimCoach(FortuneService fortuneService) {
		System.out.println(">> SwimCoach: inside constructor with DI.");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1 kilometer as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}