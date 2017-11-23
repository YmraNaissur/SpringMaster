package com.naissur.section06.impl;

import com.naissur.section06.interfaces.Coach;
import com.naissur.section06.interfaces.FortuneService;

public class JavaCoach implements Coach {
	private FortuneService fortuneService;
	
	// no-args constructor
	public JavaCoach() {
		/* NOP */
	}
	
	// constructor for dependency injection
	public JavaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Code some multithreading for 1 hour.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
