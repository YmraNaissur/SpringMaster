package com.naissur.section10.impl.coach;

import org.springframework.beans.factory.annotation.Value;

import com.naissur.section10.interfaces.Coach;
import com.naissur.section10.interfaces.FortuneService;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	// default constructor
	public SwimCoach() {
		System.out.println(">> SwimCoach: inside default constructor.");
	}
	
	// constructor to inject the dependency
	public SwimCoach(FortuneService fortuneService) {
		System.out.println(">> SwimCoach: inside constructor with DI.");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1 kilometer as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// getters for private properties
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}