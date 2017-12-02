package com.naissur.section09.impl.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.naissur.section09.interfaces.Coach;
import com.naissur.section09.interfaces.FortuneService;

@Component
public class JavaCoach implements Coach {
	private FortuneService fortuneService;
	
	// default constructor
	public JavaCoach() {
		System.out.println(">> JavaCoach: inside of default constructor.");
	}
	
	@Autowired
	public JavaCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Train Cloneable and clone() for an hour.";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> JavaCoach: inside of doMyStartupStuff().");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> JavaCoach: inside of doMyCleanupStuff().");
	}
}