package com.naissur.section07.impl;

import org.springframework.stereotype.Component;

import com.naissur.section07.interfaces.Coach;

@Component
public class JavaCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Train some JSF today.";
	}
}