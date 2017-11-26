package com.naissur.section07.impl;

import org.springframework.stereotype.Component;

import com.naissur.section07.interfaces.Coach;

@Component
public class BasketballCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Practice three point shoots for a couple of hours.";
	}
}