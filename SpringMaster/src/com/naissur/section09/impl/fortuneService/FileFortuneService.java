package com.naissur.section09.impl.fortuneService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import com.naissur.section09.interfaces.FortuneService;

@Component
public class FileFortuneService implements FortuneService {
	private final String FORTUNES_FILE_PATH = "src/section09/fortunes.txt";
	List<String> fortunes = new ArrayList<String>();

	@PostConstruct
	private void fortunesInit() {
		System.out.println(">> FileFortuneService: fortunes init.");
		try (BufferedReader in = new BufferedReader(new FileReader(FORTUNES_FILE_PATH))) {
			String currentLine;
			while ((currentLine = in.readLine()) != null) {
				fortunes.add(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@PreDestroy
	private void fortuneDestroy() {
		System.out.println(">> FileFortuneService: fortunes destroy.");
		fortunes = null;
	}
	
	@Override
	public String getFortune() {
		// generate a random value from 0 to fortunes number ...
		Random rand = new Random();
		int index = rand.nextInt(fortunes.size());
		// ... and return it
		return fortunes.get(index);
	}
}
