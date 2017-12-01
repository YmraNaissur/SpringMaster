package com.naissur.section09.impl.coach;

import org.springframework.stereotype.Component;

import com.naissur.section09.interfaces.Coach;

@Component
public class JavaCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Train Cloneable and clone() for an hour.";
	}
}