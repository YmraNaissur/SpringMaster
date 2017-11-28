package com.naissur.section08.impl.coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.Coach;
import com.naissur.section08.interfaces.FortuneService;

@Component
public class BikeCoach implements Coach {
	private FortuneService fortuneService;
	
	// define default constructor
	public BikeCoach() {
		System.out.println(">> BikeCoach: inside default constructor.");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Make a 200 kilometers ride.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// dependency injection with ANY method
	@Autowired
	public void doSomeCrazyStuff(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		System.out.println(">> BikeCoach: inside doSomeCrazyStuff() method (it is actually not a setter!).");
		this.fortuneService = fortuneService;
	}

	// define a setter method
	/*public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println(">> BikeCoach: inside setFortuneService() method.");
	}*/
}
