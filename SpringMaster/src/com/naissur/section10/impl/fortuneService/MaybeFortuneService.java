package com.naissur.section10.impl.fortuneService;

import com.naissur.section10.interfaces.FortuneService;

public class MaybeFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Maybe today you'll play it without mistakes.";
	}
}