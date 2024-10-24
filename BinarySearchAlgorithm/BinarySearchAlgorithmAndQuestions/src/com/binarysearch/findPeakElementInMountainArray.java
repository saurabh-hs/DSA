package com.binarysearch;

public class findPeakElementInMountainArray {

	public static void main(String[] args) {
		int[] arr = {1,2,1,3,5,6,4};
		
		System.out.println(findPeak(arr));

	}
	
	// https://leetcode.com/problems/peak-index-in-a-mountain-array/
    // https://leetcode.com/problems/find-peak-element/
	static int findPeak(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] > arr[mid + 1]) {
				//you are in desc part of an array
				//this may be the ans, but look at left
				end = mid;
			}else {
				//you are in asc part of an array
				start = mid + 1;
			}
		}
		
		return start;
	}

}
