package com.app;

public class SearchInRange {

	public static void main(String[] args) {
		int[] arr = {12, 23, 3, 4213, 123, 564, 678, 454};
		
		System.out.println(linearSearch(arr, 2, 4, 123));

	}
	
	static int linearSearch(int[] arr, int start, int end, int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		for(int index = start; index <= end; index++) {
			if(arr[index] == target) {
				return index;
			}
		}
		
		return -1;
	}

}
