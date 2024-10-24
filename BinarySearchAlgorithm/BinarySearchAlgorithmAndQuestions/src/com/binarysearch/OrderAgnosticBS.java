package com.binarysearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		int[] arr = {1002, 908, 687, 123, 89, 67, 45, 23, 12, 9, 8, 0, -1, -23, -584};
		
		int[] arr1 = {-1234, -120, -90, -21, -15, 0, 24, 67, 89, 100, 123, 145, 167, 890, 1000};
		int target = 908;
		
		int ans = orderAgnosticsBS(arr, target);
		
		System.out.println(ans);
		
	}
	
	//if element is present in array it will return index of element
	//else it will return -1.
	static int orderAgnosticsBS(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
		//check array is ascending sort or descending sort
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			//if Array is in ascending sort
			if(isAsc) {
				//if target element is less than mid element search left side array.
				if (target < arr[mid]) {
					end = mid - 1;	
				
				//else if target element is more than mid element search right side array	
				}else {
					start = mid + 1;
				}
			
				//Array is in descending sort
			}else {
				//if array element is less than mid element search right side array
				if(target < arr[mid]) {
					start = mid + 1;
				
				//if array element is more than mid element search left side array	
				}else {
					end = mid - 1;	
				}
			}
		}
		
		//element not found
		return -1;
	}

}
