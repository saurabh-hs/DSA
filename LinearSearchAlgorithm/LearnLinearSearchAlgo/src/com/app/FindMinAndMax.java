package com.app;

public class FindMinAndMax {

	public static void main(String[] args) {
		int[] arr = {123,42,454,12,56,678,21,4534,2,324};
		
		System.out.println("Minimum: "+findMin(arr));
		System.out.println("Maximum: "+findMax(arr));
	}
	
	static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}

}
