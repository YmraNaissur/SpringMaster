package com.naissur.section09.impl.coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.naissur.section09.interfaces.Coach;

@Component
public class JavaCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Train Cloneable and clone() for an hour.";
	}

	// default constructor
	public JavaCoach() {
		System.out.println(">> JavaCoach: inside of default constructor.");
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