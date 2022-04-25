/*
 * Client 2 - Panasonic has selected both the basic features and advance
 * features of calculator.
 */
package com.simplilearn.calculator;

import java.util.Scanner;

public class panasonicCalculator {
	
	public void display() {
		
		arithematicCalculator c = new arithematicCalculator();
		advanceArithematicCalculator d = new advanceArithematicCalculator();
		
		double result;
		try (Scanner num1 = new Scanner(System.in)) {
			System.out.println("Enter First Value");
			int a = num1.nextInt(); 
			System.out.println("Enter Second Value");
			try (Scanner num2 = new Scanner(System.in)) {
				int b = num2.nextInt();
				
				System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n"
						+ "4.Division\n5.Cube\n6.Square\n7.Power\n8.AreaOfCircle\n"
						+ "9.CircumferenceOfCircle\n10.DiameterOfCircle\n"
						+ "11.PerimeterOfRectangle\n");
				
				try (Scanner option = new Scanner(System.in)) {
					int o = option.nextInt();
					
					//Prints all the Calculations;	
						switch (o) {
						case 1: {
							result=c.addition(a,b);
							System.out.println(result);
							break;
						}
						case 2: {
							
							result=c.subtraction(a, b);
							System.out.println(result);
							break;
							
						}
						case 3: {
							
							result=c.multiplication(a, b);
							System.out.println(result);
							break;
							
						}
						case 4: {
							
							result=c.division(a, b);
							System.out.println(result);
							break;
							
						}
						case 5: {
							
							result=c.cube(a);
							System.out.println(result);
							break;
							
						}
						case 6: {
							
							result=c.square(a);
							System.out.println(result);
							break;
							
						}
						case 7: {
							
							result=c.power(a, b);
							System.out.println(result);
							break;
							
						}
						case 8: {
							
							d.areaOfCircle(a, b);;
							break;
							
						}
						case 9: {
							
							d.circumferenceOfCircle(a, b);
							break;
							
						}
						case 10: {
							
							d.diameterOfCircle(a, b);
							break;
							
						}
						case 11: {
							
							d.perimeterOfRectangle(a, b);
							break;
							
						}
						default:
							throw new IllegalArgumentException("Unexpected value: " +o);
						}
				}
			}
		}
		
		}

}
