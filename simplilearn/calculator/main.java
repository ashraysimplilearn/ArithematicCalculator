package com.simplilearn.calculator;

import java.util.Scanner;

public class main {
	
	@SuppressWarnings("resource")
	public static void main(String args[]){
	
	arithematicCalculator c = new arithematicCalculator();
	
	
	double result;
	Scanner num1 = new Scanner(System.in); 
	System.out.println("Enter First Value");
	int a = num1.nextInt(); 
	System.out.println("Enter Second Value");
	Scanner num2 = new Scanner(System.in);
	int b = num2.nextInt();
	
	System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Cube\n6.Square\n7.Power");
	Scanner option = new Scanner(System.in);
	int o = option.nextInt();
	
	//Prints all the Calculators;
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
		default:
			throw new IllegalArgumentException("Unexpected value: " +o);
		}
	
	}

}
