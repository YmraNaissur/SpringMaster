package com.naissur.section10.impl.coach;

import com.naissur.section10.interfaces.Coach;
import com.naissur.section10.interfaces.FortuneService;

public class GuitarCoach implements Coach {
	private FortuneService fortuneService;
	
	// default constructor
	public GuitarCoach() {
		/* NOP */
	}
	
	// constructor for DI
	public GuitarCoach(FortuneService fortuneSerivce) {
		this.fortuneService = fortuneSerivce;
	}

	@Override
	public String getDailyWorkout() {
		return "Play 'Waiting' for a 5 times today.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}