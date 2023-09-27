package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		
		PickNumber pickedInput = new PickNumber();	
		Integer newNum = null;
		
		for(int i = 1; i <= 5; i++) {
			while(true) {
				
				String answer = pickedInput.picNum(scanner,"Pick a number between 1 and 100");
				newNum = pickedInput.reCreate(answer);	
				
				if (newNum >= 1 && newNum <= 100) {
					break;
				} else {
					System.out.println("\n" + "Your guess is not between 1 and "
					+ "100, please try again");
				}
			}
			if (newNum == randomNumber) {	
				System.out.println("\n" + "You win!");
				break;
			}
			if (i == 5) {
				System.out.println("\n" + "You lose!");
				System.out.println("\n" + "The number to guess was: " + randomNumber);
				break;
			}

			if (newNum >=1 && newNum <=100) {
				pickedInput.checkNum(newNum, randomNumber);
			}
		
		
	}
		scanner.close();
	}}
