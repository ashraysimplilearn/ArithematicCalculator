package com.simplilearn.calculator;

import java.util.Scanner;

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
