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
		
		String answer = pickedInput.picNum(scanner,"Pick a number between 1 and 100");
		Integer upgradedInput = Integer.parseInt(answer);
		if (upgradedInput < 1 ) {
			System.out.println("Please pick a higher number");
			if (upgradedInput > 100) {
				System.out.println("Please pick a lower number");
			}
		}else if (upgradedInput >= 1 && upgradedInput <= 100 && upgradedInput
				!= randomNumber) {
			System.out.println("You win");
		}
		System.out.println(upgradedInput);
		
		
		
		scanner.close();
	}
		
}
