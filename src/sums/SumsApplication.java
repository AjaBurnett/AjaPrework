package sums; 
 
 
 import java.util.Scanner; 
 
 
 public class SumsApplication { 
 
 
 	public static void main(String[] args) { 
 
 
 		// Create new scanner 
 		Scanner input = new Scanner(System.in); 
 
 
 		// Values of each digit 
 
 
 		int hundreds = 0; 
 		int tens = 0; 
 		int ones = 0; 
 		int hundreds2 = 0; 
		int tens2 = 0; 
 		int ones2 = 0; 
 
 
 		// Prompt user to input 3 digit number 
 		System.out.println(" enter two  3-digit numbers . "); 
 
 
 		System.out.println(" "); 
 
 
 		System.out.println( 
 				"If the corresponding place in the two numbers (ones, tens hundreds) sums to the same total, the response will be TRUE"); 
 
 
 		System.out.println(" "); 
 
 
 		System.out.println( 
 				"If the corresponding place in the two numbers (ones, tens hundreds) does NOT sum to the same total, the response will be FALSE"); 
 
 
 		System.out.println(" "); 
 
 
 		System.out.print("Enter a 3-digit positive number here: "); 
 		while (input.hasNextInt() == false) { 
 			System.out.println("Error. Please enter in a 3 digit positive number into the input box..."); 
 			input.next(); 
 		} 
 
 
 		int number = input.nextInt(); 
 
 
 		// Error if number is more than three digits 
 		if (number > 999) { 
 			System.out.println("Number more then 3 digits."); 
 			input.next(); 
 		} 
 
 
 		// Error if number is less than three digits 
 		if (number < 100) { 
 			System.out.println("Number less then 3 digits."); 
 			input.next(); 
 		} 
 
 
 		System.out.print(" enter your second 3-digit positive number here: "); 
 		while (input.hasNextInt() == false) { 
 			System.out.println("Error. Please enter a 3 digit number into the input box..."); 
 			input.next(); 
 		} 
 
 
 		int number2 = input.nextInt(); 
 
 
 		// Error if number2 is more than three digits 
 		if (number2 > 999) { 
 			System.out.println("\nError. Number more then 3 digits."); 
 			input.next(); 
 		} 
 
 
 		// Error if number2 is less than three digits 
 		if (number2 < 100) { 
 			System.out.println("Error. Number less then 3 digits."); 
 			input.next(); 
 		} 
 
  		// Displays hundreds place digit 
 		hundreds = number / 100; 
 		tens = (number % 100) / 10; 
 		ones = number % 10; 
 
 
 		// Displays hundreds place digit 
 		hundreds2 = number2 / 100; 
 		tens2 = (number2 % 100) / 10; 
 		ones2 = number2 % 10; 
 
 
 		int finalOnes = ones + ones2; 
 		int finalTens = tens + tens2; 
 		int finalHund = hundreds + hundreds2; 
 
 
 		if (finalOnes == finalTens && finalHund == finalTens) { 
 			System.out.println("True");  
 
 		} else { 
 			System.out.println("False"); 
 		} 
 
 
 		input.close(); 
 	} 
 } 

