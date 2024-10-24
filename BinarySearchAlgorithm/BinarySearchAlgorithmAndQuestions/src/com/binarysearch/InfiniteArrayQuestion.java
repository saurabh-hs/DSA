package com.binarysearch;

//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/


public class InfiniteArrayQuestion {

	public static void main(String[] args) {
		int arr[] = new int[]{3, 5, 7, 9, 10, 90, 
                100, 130, 140, 160, 170};
		int target = 10;
		
		System.out.println(ans(arr, 10));

	}
	
	static int ans(int[] arr, int target) {
		//first find the range
		//first start with a box size 2
		
		int start = 0;
		int end = 1;
		
		// condition for the target to lie in the range
		while(target > arr[end]) {
			int temp = end + 1;  //this is my new start
			//double the box value
			//end = previous end + sizeofbox*2
			
			end = end + (end - start + 1) * 2;
			start = temp;
		}
		
		return binarySearch(arr, target, start, end);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		while(start <= end) {
			//find the middle element in the array
			int mid = start + (end - start) / 2;
			
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				//ans found
				return mid;
			}
		}
		
		//ans not found
		return -1;
	}

}
