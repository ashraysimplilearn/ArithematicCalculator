package com.simplilearn.calculator;

public class arithematicCalculator {
	
	int a;
	int b;
	
	//Addition of Two Number
	public int addition(int a, int b) {
		this.a=a;
		this.b=b;
		return a+b;
	}
	
	//Subtraction of Two Number
	public int subtraction(int a, int b) {
		this.a=a;
		this.b=b;
		return a-b;
	}
	
	//Multiplication of Two numbers
	public int multiplication(int a, int b) {
		this.a=a;
		this.b=b;
		return a*b;
	}
	// Division of two Number
	@SuppressWarnings("finally")
	public int division(int a, int b) {
		this.a=a;
		this.b=b;
		try {
			if(b == 0 || a == 0) {
				System.out.println("This is invalid input");
		    }
		}
		catch(Exception e) {
			System.out.println("Exception Caught");
		}
		finally {
			return a/b;
		}
	}
	// Square of a Number
	public int square(int a) {
		this.a=a;
		return a*a;
	}
	
	// Cube of a number
	public int cube(int a) {
		this.a=a;
		return a*a*a;
	}
	
	// Power of Two number
	public double power(int a, int b) {
		this.a=a;
		this.b=b;
		return(Math.pow(a, b));
	}
	
	

}
