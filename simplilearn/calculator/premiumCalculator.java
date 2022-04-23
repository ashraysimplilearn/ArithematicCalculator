package com.simplilearn.calculator;

public interface premiumCalculator {
	
	/*
	 * This is basic structure of a calculator which contains 
	 * all the below features. As this is a interface all the methods declared here
	 * are abstract (which will not contain any code)
	 */
	public int addition(int a, int b);
	public int subtraction(int a, int b);
	public int multiplication(int a, int b);
	public int division(int a, int b);
	public int square(int a);
	public int cube(int a);		

}
