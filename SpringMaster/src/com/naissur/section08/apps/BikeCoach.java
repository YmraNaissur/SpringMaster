package com.naissur.section08.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.Coach;
import com.naissur.section08.interfaces.FortuneService;

@Component
public class BikeCoach implements Coach {
	private FortuneService fortuneService;
	
	// define default constructor
	public BikeCoach() {
		System.out.println(">> BikeCoach: inside default constructor.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Make a 200 kilometers ride.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// define a setter method for dependency injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println(">> BikeCoach: inside setFortuneService() method.");
	}
}
