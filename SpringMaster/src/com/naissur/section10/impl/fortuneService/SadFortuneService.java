package com.naissur.section10.impl.fortuneService;

import com.naissur.section10.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is a sad day.";
	}
}