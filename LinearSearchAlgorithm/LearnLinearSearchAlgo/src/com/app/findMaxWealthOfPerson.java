package com.app;

//https://leetcode.com/problems/richest-customer-wealth/

public class findMaxWealthOfPerson {

	public static void main(String[] args) {
		int[][] arr = {
				{13,24,56,23},
				{123,432},
				{123,2,3}
		};
		
		System.out.println(findMaximumWealth(arr));

	}
	
	static int findMaximumWealth(int[][] accounts) {
		int ans = Integer.MIN_VALUE;
		
		for(int[] ints : accounts) {
			//when you start a new row, take a new sum for that row
			int sum = 0;
			for(int wealth : ints) {
				sum += wealth;
			}
			
			//now we have sum of accounts of person
			//check with overall ans
			if(sum > ans) {
				ans = sum;
			}
		}
		
		return ans;
	}

}
