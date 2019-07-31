package com.bridgelabz;


import org.junit.Test;

import junit.framework.TestCase;

public class PalindromeTest extends TestCase {
	
	PalindromeChecker testObject;
	
	public void setUp()
	{
		testObject=new PalindromeChecker();
	}

	@Test
	 public void testCreatePalindromeTestObject() throws Exception {
    
    assertNotNull(testObject);
}
	public void testSimplePalindrome_YesPalindrome() throws Exception {
		assertTrue(testObject.isAPalindrome("MOM"));
	}
	
	public void testSimplePalindrome_NotAPalindrome() throws Exception {
		assertFalse(testObject.isAPalindrome("Snehal"));
		
	}
	
	public void testSimplePalindrome_NotAPalindrome2() throws Exception {
		assertFalse(testObject.isAPalindrome("BridgelabzSolutionsMumbai"));
		
}
	public void testComplexPlaindromeOnMethod() throws Exception
	{
		assertTrue(testObject.isAPalindrome("kinnikinnik"));
	}
}