package com.bridgelabz;

public class PalindromeChecker {

	public boolean isAPalindrome(String string) {
//		if(string.equals("Snehal"))
//			return false;
		
		
		return string.equalsIgnoreCase(getReversedString(string));
			
	}

	private String getReversedString(String string) {
		StringBuffer reverseStringBuffer=new  StringBuffer(string);
		reverseStringBuffer.reverse();
		return reverseStringBuffer.toString();
	}

	

}
