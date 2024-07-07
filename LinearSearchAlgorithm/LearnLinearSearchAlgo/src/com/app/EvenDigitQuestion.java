package com.app;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigitQuestion {

	public static void main(String[] args) {
		int[] arr = {23,142,4,677,43255,23};
		
		System.out.println(findNumbers(arr));

	}
	
	//function to check whether a number contains even digits or not
	static int findNumbers(int[] arr) {
		int count = 0;
		
		for(int element : arr) {
			if(even(element)) {
				count++;
			}
		}
		
		return count;
	}
	
	static boolean even(int num) {
		int numberOfDigits = digits(num);
		
//		if(numberOfDigits % 2 == 0) {
//			return true;
//		}
//		
//		return false;
		
		return numberOfDigits % 2 == 0;
	}
	
	static int digits2(int num) {
		if(num < 0) {
			num = num * -1;
		}
		
		return (int)(Math.log10(num)) +  1;
	}
	
	static int digits(int num) {
		if(num < 0) {
			num = num * -1;
		}
		
		if(num == 0) {
			return 1;
		}
		
		int count = 0;
		while(num > 0) {
			count++;
			num = num/10;
		}
		
		return count;
	}

}
