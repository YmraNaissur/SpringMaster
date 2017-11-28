package com.naissur.section08.impl.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.Coach;
import com.naissur.section08.interfaces.FortuneService;

@Component
public class JavaCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public JavaCoach() {
		System.out.println(">> JavaCoach: inside default constructor.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice some Spring today.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
