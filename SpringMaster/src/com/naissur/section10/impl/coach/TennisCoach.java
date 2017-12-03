package com.naissur.section10.impl.coach;

import org.springframework.stereotype.Component;

import com.naissur.section10.interfaces.Coach;
import com.naissur.section10.interfaces.FortuneService;

@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
	// default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor.");
	}

	// constructor to inject the dependency
	public TennisCoach(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside constructor with DI.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Train your backhand today.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}