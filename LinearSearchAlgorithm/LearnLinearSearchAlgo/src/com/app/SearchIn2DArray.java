package com.app;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{23,13,45,67},
				{12,54},
				{54,1,56},
				{1234,45,-12,-90,34,12},
				{31,4,31}
		};
		
		int[] ans = search(arr, 54);
		System.out.println(Arrays.toString(ans));
		System.out.println("Min: "+min(arr));
		System.out.println("Max: "+max(arr));
	}
	
	//if element present it will return index of element in int arr
	//else it will return incorrect {-1,-1} index
	static int[] search(int[][] arr, int target) {
		if(arr.length == 0) {
			return new int[]{-1,-1}; 
		}
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] == target) {
					return new int[] {row,col};
				}
			}
		}
		
		return new int[] {-1,-1};
	}
	
	static int min(int[][] arr) {
		int min = Integer.MAX_VALUE;
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] < min) {
					min = arr[row][col];
				}
			}
		}
		
		return min;		
	}
	
	static int max(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for(int[] elements : arr) {
			for(int element : elements) {
				if(element > max) {
					max = element;
				}
			}
		}
		
		return max;
	}

}
