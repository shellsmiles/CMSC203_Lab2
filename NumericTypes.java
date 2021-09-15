
/**
* CMSC 203 Lab 2_task 3
* Instructor: Prof. Alexander
* Programmer: Yana Li
* This program demonstrates how numeric types and operators behave in Java
*/

import java.util.Scanner;

public class NumericTypes {
	
	public static void main (String [] args) {
		Scanner kb= new Scanner (System.in);//TASK #3 Create a Scanner object here 
		
		//identifier declarations
		final int NUMBER = 2 ; // number of scores
		// the original code:  int score1 = 100; // first test score
		// the original code:  int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		int fTem;//Task #3 declare a variable to hold the user’s temperature
		double cTem;
		
		System.out.println("Please enter the first score: ");//Task #3 prompt user to input score1
		int score1= kb. nextInt(); //Task #3 read score1 
		System.out.println("Please enter the second score: ");//Task #3 prompt user to input score2
		int score2= kb. nextInt(); //Task #3 read score2 
		average = ((double)score1 + score2) / NUMBER; // Find an arithmetic average
		
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		System.out.println();
		
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9) * (BOILING_IN_F - 32);
		
	
		output = "Water boils is "+ BOILING_IN_F + " degrees in Fahrenheit or " + fToC + " in Celsius"; 
		System.out.println(output);  
		
		System.out.println("Please enter a Fahrenheit temperature: ");//Task #3 prompt user to input another temperature
		fTem= kb. nextInt ();//Task #3 read the user’s temperature in Fahrenheit
		cTem= (5.0/9) * (fTem - 32);//Task #3 convert the user’s temperature to Celsius
		System.out.printf (fTem + " degrees in Fahrenheit is %.1f degrees in Celsius.", cTem); //Task #3 print the user’s temperature in Celsius
		System.out.println("\nGoodbye"); // to show that the program is ended	
	}
}
