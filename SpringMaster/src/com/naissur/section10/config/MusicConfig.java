package com.naissur.section10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.naissur.section10.impl.coach.GuitarCoach;
import com.naissur.section10.impl.fortuneService.MaybeFortuneService;
import com.naissur.section10.interfaces.Coach;
import com.naissur.section10.interfaces.FortuneService;

@Configuration
public class MusicConfig {
	@Bean
	public FortuneService maybeFortuneService() {
		return new MaybeFortuneService();
	}
	
	@Bean
	public Coach guitarCoach() {
		return new GuitarCoach(maybeFortuneService());
	}
}
