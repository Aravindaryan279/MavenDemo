package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c=new Calculator();
	
	@Test
	public void testsayHello() {
		Assertions.assertEquals("Hello",c.sayHello());
		
	}
	@Disabled
	@Test
	public void testAdd() {
		Assertions.assertEquals(100,c.add(60,40));
	}
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("meenal".length()==6);
		Assertions.assertTrue("meenal".length()==10);
		Assertions.assertNotEquals("Hello","Hello");
		
	}
	@Test
	void testAssertNull() {
		String str1=null;
		String str2="abcd";
		Assertions.assertNull(str1);
		Assertions.assertNull(str2);
		
	}
	
 
	}
	
	




