/*
 * Advance Arithmetic calculator has an extended option where it contains 
 * advance features like areaofcircle, circumference, diameter and perimeter
 * 
 */

package com.simplilearn.calculator;

public class advanceArithematicCalculator {
	
	double a;
	double b;
	
	public void areaOfCircle(double a, double b) {
		
		this.a = a;
		this.b = b;
		double circleArea;
		double circleArea1;
		
		if(a != 0 && b == 0) {
			
			circleArea = Math.PI * a * a ;
			System.out.println("Area with value "+a+ " is: "+Math.round(circleArea));
		}
		else if(a != 0 && b !=0  ) {
			
			circleArea = Math.PI * a * a ;
			circleArea1 = Math.PI * b * b ;
			
			System.out.println("Area with value "+a+ " is: "+Math.round(circleArea));
			System.out.println("Area with value "+b+ " is: "+Math.round(circleArea1));
			
		}
		else if (a ==0 && b != 0)
		{
			circleArea = Math.PI * b * b ;
			System.out.println("Area with value "+b+ "is: "+Math.round(circleArea));
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	
	public void circumferenceOfCircle(double a, double b) {
		
		this.a = a;
		this.b = b;
		double circleCircumference;
		double circleCircumference1;
		
		if(a != 0 && b == 0) {
			
			circleCircumference = 2 * Math.PI  * a ;
			System.out.println("Circumference with value "+a+ " is: "+Math.round(circleCircumference));
		}
		else if(a != 0 && b !=0  ) {
			
			circleCircumference = 2 * Math.PI * a  ;
			circleCircumference1 = 2 * Math.PI * b ;
			
			System.out.println("Circumference with value "+a+ " is: "+Math.round(circleCircumference));
			System.out.println("Circumference with value "+b+ " is: "+Math.round(circleCircumference1));
			
		}
		else if (a ==0 && b != 0)
		{
			circleCircumference = 2 * Math.PI * b ;
			System.out.println("Circumference with value "+b+ " is: "+Math.round(circleCircumference));
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}
	
	public void diameterOfCircle(double a, double b) {
		
		this.a = a;
		this.b = b;
		double circleDiameter;
		double circleDiameter1;
		
		if(a != 0 && b == 0) {
			
			circleDiameter = 2 * a ;
			System.out.println("Diameter with value "+a+ " is: "+Math.round(circleDiameter));
		}
		else if(a != 0 && b !=0  ) {
			
			circleDiameter = 2 * a  ;
			circleDiameter1 = 2 * b ;
			
			System.out.println("Diameter with value "+a+ " is: "+Math.round(circleDiameter));
			System.out.println("Diameter with value "+b+ " is: "+Math.round(circleDiameter1));
			
		}
		else if (a ==0 && b != 0)
		{
			circleDiameter = 2 * b ;
			System.out.println("Diameter with value"+b+ " is: "+Math.round(circleDiameter));
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}
	
	public void perimeterOfRectangle(double a, double b) {
		
		this.a = a;
		this.b = b;
		double rectanglePerimeter;	
	
		rectanglePerimeter = 2 * (a + b)  ;
			
		System.out.println("Perimeter of Rectangle is: "+Math.round(rectanglePerimeter));
		
	}
	
	
	
	
	
	

}
