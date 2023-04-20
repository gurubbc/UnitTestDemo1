package com.ofss;

// Dev Code
public class HelloWorld {

	public String sayHello()
	{
		System.out.println("Calling sayHello");
		System.out.println("This is another line one more time");
		return "Hello";
	}
	
	public double calculateSimpleInterest(double p, double r, int t) 
	{
		return p*(1+r*t); // intentionally introduced some bug
	}

	public static void main(String[] args) {
		System.out.println("This is excellent");
	}

}
