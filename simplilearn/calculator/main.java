/*
 * Objective: This application is designed to give the customer an option
 * to select different brands of calculator
 */
package com.simplilearn.calculator;

import java.util.Scanner;
/*
 * This is a Main program which contains an option for the user
 * to select the type of calculator
 */

public class main {
	
	public static void  main(String []args){
		
		casioCalculator c1 = new casioCalculator();
		panasonicCalculator p1 = new panasonicCalculator();
		
		while(true) {
		System.out.println("Select The Type of Calculators\n");
		System.out.println("1.Casio\n2.Panasonic\n");
		
		try (Scanner calType = new Scanner(System.in)) {
			int option = calType.nextInt();
			
			if(option == 1) {
			
				c1.display();
			}
			else if (option == 2) {

					p1.display();
			}
			else {
				
				System.out.println("Invalid Choice");
			}
		}
		continue;
		}
		
				
	}
}
