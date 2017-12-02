package com.naissur.section09.impl.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.naissur.section09.interfaces.Coach;
import com.naissur.section09.interfaces.FortuneService;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
	// default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside of default constructor.");
	}
	
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Train your backhand.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}