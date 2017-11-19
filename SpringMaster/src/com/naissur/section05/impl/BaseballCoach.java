package com.naissur.section05.impl;

import com.naissur.section05.interfaces.Coach;
import com.naissur.section05.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// no-args constructor
	public BaseballCoach() {
		/* NOP */
	}

	// define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune (dependency = helper)
		return fortuneService.getFortune();
	}
}