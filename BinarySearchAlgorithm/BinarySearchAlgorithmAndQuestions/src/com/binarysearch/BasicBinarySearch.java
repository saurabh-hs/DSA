package com.binarysearch;

//For binary search array should be in sorted manner.

public class BasicBinarySearch {

	public static void main(String[] args) {
		int[] arr = {-123, -23, -8, 0, 2, 4, 67, 89, 100, 234};
		int target = 0453;
		
		int ans = binarySearch(arr, target);
		System.out.println(ans);
	}
	
	//if element is present in array it will return index of element
	//else it will return -1 
	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		//calculate till start less than or equal to end
		while(start <= end) {
			//find the middle element
			//int mid = (start + end) / 2;  //might be possible that (start + end) will exceeds int limit in java.
			int mid = start + (end - start) / 2;
			//s + (e - s) / 2 = 2s + 2e /2 = (s+e) / 2
			
			//if target element is greater than mid element then will search in right side array
			if(arr[mid] < target) {
				start = mid + 1;
			
			//else if target element is less than mid element then will search in left side array	
			}else if(arr[mid] > target) {
				end = mid - 1;
				
			//else element found will return index of element	
			}else {
				return mid;
			}
		}
		
		//element not found then will return invalid index -1.
		return -1;
	}

}
