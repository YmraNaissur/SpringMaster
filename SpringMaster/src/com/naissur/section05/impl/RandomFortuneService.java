package com.naissur.section05.impl;

import java.util.Random;

import com.naissur.section05.interfaces.FortuneService;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes = {"You'll handle it, I believe!",
						"Do your best, you'll handle it!",
						"Today you should do your best!"};

	@Override
	public String getFortune() {
		// return random fortune string from the array
		int index = new Random().nextInt(fortunes.length);
		return fortunes[index];
	}
}