
/*CMSC 203 Lab 2_task 3
* Instructor: Prof. Alexander
* Programmer: Yana Li
* This program calculates the result of a mathematical formula
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SphereVolume {
	public static void main(String[] args) {
	
	//  Print the purpose of the program 
	//  Print a prompt asking for the diameter of a sphere 
	//	Read the diameter 
	//	Calculate the radius as diameter divided by 2 
	//	Calculate volume of the sphere using the formula (see Task #3b) 
		 
		
	// add your declaration and code here 
		Scanner kb= new Scanner (System.in);
		String input;
		double diam, radius,vol;
	
		
		System.out.println("This program calculates the result of a mathematical formula");
		input= JOptionPane.showInputDialog("Please enter a diameter(m): ");
		diam= Double.parseDouble (input);
		radius= diam/2;
		vol= (4.0/3)* Math.PI* (Math.pow (radius, 3.0));
		System.out.printf ("When diameter is " +diam +
							". The volume of the sphere is %.3f cubic meter.", vol);
	} 
}
