package com.naissur.section08.impl.coach;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.Coach;

@Component
public class SwimCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Override
	public String getDailyWorkout() {
		return "Swim for a 1 hour today.";
	}

	@Override
	public String getDailyFortune() {
		return "This is a placeholder.";
	}

	// getter methods for email and team
	public String getEmail() { return email; }
	public String getTeam() { return team; }
}
