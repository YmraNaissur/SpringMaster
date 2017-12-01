package com.naissur.section09.impl.coach;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.naissur.section09.interfaces.Coach;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Train your backhand.";
	}
}