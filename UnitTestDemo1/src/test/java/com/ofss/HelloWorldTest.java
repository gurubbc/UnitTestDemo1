package com.ofss;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	
	@Test
	public void testSayHello()
	{
		// unit testing code for testing "sayHello" method
		HelloWorld hw=new HelloWorld();
		
		String actual=hw.sayHello();
		String expected="Hello"; // this is what I expect from the above method
		
		// compare if actual is equal to expected, if so, unit testing passes
		// if not, unit testing fails, you need to look at the dev code for 
		// any fix required
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testCalculateSimpleInterest()
	{
		// unit testing code for testing "calculateSimpleInterest" method
		HelloWorld hw=new HelloWorld();
		double actual=hw.calculateSimpleInterest(1000, 0.1, 1);
		double expected=1100;
		// compare if actual is equal to expected, if so, unit testing passes
		// if not, unit test fails, we need to check the dev code for any bugs
		assertEquals(expected, actual);
		
	}

}
