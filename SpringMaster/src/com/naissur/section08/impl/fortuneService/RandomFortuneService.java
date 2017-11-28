package com.naissur.section08.impl.fortuneService;

import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "";
	}
}