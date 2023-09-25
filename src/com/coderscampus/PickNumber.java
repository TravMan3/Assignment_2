package com.coderscampus;

import java.util.Scanner;

public class PickNumber {

	String picNum (Scanner scanner, String displayedMessage) {
		System.out.print("\n" + displayedMessage + " ");
		String userInput = scanner.nextLine();
		return userInput;
	}
	
	Integer reCreate (String a) {
		Integer upgradedInput = Integer.parseInt(a);
		return upgradedInput;		
	}
	
	Integer oneHunCheck (Integer check) {
		if (check < 1 || check > 100) {
			System.out.println("\n" + "Your guess is not between 1 and "
					+ "100, please try again");			
		}
		return check;
	}

	Integer checkNum (Integer theNum, Integer random) {
		if (theNum > random) {
			System.out.println("\n" + "Please pick a lower number");
		}else if (theNum < random) {
			System.out.println("\n" + "Please pick a higher number");
		}
		return 9876;
	}
}
