package com.naissur.section07.impl;

import org.springframework.stereotype.Component;

import com.naissur.section07.interfaces.Coach;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}
}