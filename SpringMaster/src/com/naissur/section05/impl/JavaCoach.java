package com.naissur.section05.impl;

import com.naissur.section05.interfaces.Coach;
import com.naissur.section05.interfaces.FortuneService;

public class JavaCoach implements Coach {
	// dependency
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Work on generics for 2 hours.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// setter for dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("JavaCoach: inside setter method - setFortuneService.");
		this.fortuneService = fortuneService;
	}
}
