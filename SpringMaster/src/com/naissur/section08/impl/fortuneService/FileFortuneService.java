package com.naissur.section08.impl.fortuneService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.naissur.section08.interfaces.FortuneService;

@Component
public class FileFortuneService implements FortuneService {
	// the file path
	private final String FORTUNES_FILE = "src/section08/fortunesFile.txt";
	
	// random generator
	private Random randGenerator = new Random();
	
	// fortunes
	private ArrayList<String> fortunesList = new ArrayList<String>();
	
	// create the FileFortuneService instance and fill list of fortunes
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside constructor.");
		fillData();
	}
	
	// fill list of fortunes
	private void fillData() {
		File file = new File(FORTUNES_FILE);
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			System.out.println("Reading fortunes from file " + file.getAbsolutePath());
			System.out.println("File exists: " + file.exists());
			
			String currentLine;
			while ((currentLine = reader.readLine()) != null) {
				fortunesList.add(currentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		// pick a random string from the fortunesList
		return fortunesList.get(randGenerator.nextInt(fortunesList.size()));
	}
}
