package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean guessNumber = false;
		Random random = new Random();
		Scanner scanner= new Scanner(System.in);
			while ( guessNumber == false) {
				System.out.println("Pick a number between 1 and 100");
			}
				int randomNumber= random.nextInt(100)+1;
		
			for(int i =0; i < 5; i++){
			System.out.println("");
			
			int player = scanner.nextInt();
			
			if (player == randomNumber) {
				System.out.println("You Win!");
			}
			else if (randomNumber > player) {
				System.out.println( "Please pick a higher number" );
			}
			else { System.out.println("Please pick a lower number");

	}
	   }
	}


	}


