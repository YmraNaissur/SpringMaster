package com.naissur.section08.impl.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.Coach;
import com.naissur.section08.interfaces.FortuneService;

@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	
	@Autowired
	public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneSevice) {
		this.fortuneService = fortuneSevice;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
