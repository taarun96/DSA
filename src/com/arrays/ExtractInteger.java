package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class ExtractInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> finalResult=extractInt("1.Hello My Name is Taarun.2.My Jersey number is 96");
		System.out.println(finalResult.toString());
		//https://www.geeksforgeeks.org/problems/extract-the-integers4428/1

	}
	
	 public static List<String> extractInt(String s) {
	        // code here
	        ArrayList<String> result = new ArrayList<>();
	        StringBuilder num = new StringBuilder();

	        // Traverse through each character in the string
	        for (char ch : s.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                num.append(ch);
	            } else {
	                // If a non-digit is encountered and we have accumulated digits
	                if (num.length() > 0) {
	                    result.add(num.toString());
	                    num.setLength(0); // Clear the StringBuilder for the next number
	                }
	            }
	        }

	        // Check if there's a trailing number left at the end of the string
	        if (num.length() > 0) {
	            result.add(num.toString());
	        }

	       

	        return result;
	    }

}
