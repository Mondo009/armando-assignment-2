package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int attempts=0;
		int maxAttempts =5;
		try(Scanner scanner = new Scanner(System.in)) {
	
				int randomNumber= random.nextInt(100)+1;
				System.out.println(randomNumber);
				
				while(true){
					
				System.out.println("Pick a number between 1 and 100");
				
				int guessNumber= scanner.nextInt();
				if (guessNumber < 1 || guessNumber >100) {
					System.out.println("Pick a number between 1 and 100");
					continue;}
				
					attempts++;
				
				 if (guessNumber == randomNumber) {
					System.out.println("You Win!");
					break;
				}
				else if (randomNumber > guessNumber) {
					System.out.println( "Please pick a higher number" );
					
				}
				else { System.out.println("Please pick a lower number");
				}
			
				
				if (attempts >= maxAttempts) {
					System.out.println("You Lose!");
					break;
					
				}
				  

				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}



				
   
		
	





