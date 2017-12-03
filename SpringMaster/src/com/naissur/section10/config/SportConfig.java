package com.naissur.section10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.naissur.section10.impl.coach.SwimCoach;
import com.naissur.section10.impl.fortuneService.HappyFortuneService;
import com.naissur.section10.impl.fortuneService.SadFortuneService;
import com.naissur.section10.interfaces.Coach;
import com.naissur.section10.interfaces.FortuneService;

@Configuration
// @ComponentScan("com.naissur.section10")
@PropertySource("classpath:section10/sport.properties")
public class SportConfig {
	// define bean for happy fortune service
	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	// define bean for sad fortune service
	@Bean
	@Primary
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		return new SwimCoach(sadFortuneService());
	}
}