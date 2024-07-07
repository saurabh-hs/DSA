package com.arrays;

import java.util.Arrays;

public class MaxValue {

	public static void main(String[] args) {
		int[] arr = { 231, 12, 45,1, 56};
		
		System.out.println(Arrays.toString(arr));
//		System.out.println(maxValue(arr));
		System.out.println(maxRange(arr, 1, 4));
	}
	
	static int maxRange(int[] arr, int start, int end) {
		int max = Integer.MIN_VALUE;
		
		for(int i = start; i <= end; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		
		return max;
	}
	
	static int maxValue(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}

}
