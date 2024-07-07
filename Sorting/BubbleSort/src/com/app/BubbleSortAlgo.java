package com.app;

import java.util.Arrays;

public class BubbleSortAlgo {

	public static void main(String[] args) {
		int[] arr = {5, 3, -23, 0, -12,  1, 2, 4};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

	}
	
	//best case O(N)
	//worst case O(N^2)
	static void bubbleSort(int[] arr) {
		boolean swapped;
		
		for(int i = 0; i < arr.length; i++) {
			swapped = false;
			
			// for each step, max item will come at the last respective index
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					
					swapped = true;
				}
			}
			
			// if you did not swap for a particular value of i, it means the array is sorted hence stop the program
			if(!swapped) { //!false = true
				break;
			}
		}
	}

}
