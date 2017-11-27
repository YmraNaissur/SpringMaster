package com.naissur.section08.impl;

import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}