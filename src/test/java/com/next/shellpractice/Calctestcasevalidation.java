package com.next.shellpractice;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;
import org.junit.Test;

public class Calctestcasevalidation {
	
	calcsample calc;
	
	// This gets execute before each method/test case
	
	@Before
	public void thisIsBeforeAnnotation() {
		calc = new calcsample();
		
	}
	//this is addition test case
	@Ignore //To ignore test case
	@Test
	public void test() {
		//fail("Not yet implemented");
		int expectedResult = 30;
		int actualResult = calc.addition(10, 20);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	//this is subtraction test case
	@Test
	public void validateSubtraction() {
		int expectedResult= 5;
		int actualResult = calc.subtraction(10, 5);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown() {
		System.out.println("Testcase is completed");
	}

}
