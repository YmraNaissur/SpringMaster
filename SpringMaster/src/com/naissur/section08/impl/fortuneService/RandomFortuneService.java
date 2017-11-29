package com.naissur.section08.impl.fortuneService;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {
	// create an array of strings
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		return data[myRandom.nextInt(data.length)];
	}
}