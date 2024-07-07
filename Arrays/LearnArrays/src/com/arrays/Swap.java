package com.arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] arr = { 2, 12, 45,1, 56};
		
		System.out.println(Arrays.toString(arr));
		swap(arr, 2, 4);
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}

}
