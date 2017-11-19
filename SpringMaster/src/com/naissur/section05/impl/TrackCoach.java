package com.naissur.section05.impl;

import com.naissur.section05.interfaces.Coach;
import com.naissur.section05.interfaces.FortuneService;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// no-args constructor
	public TrackCoach() {
		/* NOP */
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Get a hard 5k.";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

}
