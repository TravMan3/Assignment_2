package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		System.out.println(randomNumber);
		
		PickNumber pickedInput = new PickNumber();
		
		//String answer = pickedInput.picNum(scanner,"Pick a number between 1 and 100");
		
		for(int i = 1; i <= 5; i++) {
			String answer = pickedInput.picNum(scanner,"Pick a number between 1 and 100");
			Integer newNum = pickedInput.reCreate(answer);
			if (newNum == randomNumber) {	
				System.out.println("\n" + "You win!");
				break;
			}
			Integer betweenCheck = pickedInput.oneHunCheck(newNum);
			Integer checkOne = pickedInput.checkNum(betweenCheck, randomNumber);
//			System.out.println("\n" + "You lose!");
//			System.out.println("\n" + "The number to guess was: " + randomNumber);
		}
		
		
		
		
		scanner.close();
	}
		
}
