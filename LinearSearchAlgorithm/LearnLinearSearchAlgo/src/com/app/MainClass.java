package com.app;

public class MainClass {

	public static void main(String[] args) {
		int arr[] = {143, 21, 36, 4987, 5, 61, -23, -45, 78,-9078};
		int target = -450;
		
		System.out.println(linearSearch2(arr, target));

	}
	
	//If element is present it will return true else it will return false
	static boolean linearSearch3(int arr[], int target) {
		if(arr.length == 0) {
			return false;
		}
		
		for(int element : arr) {
			if(element == target) {
				return true;
			}
		}
		
		return false;
	}
	
	static int linearSearch2(int arr[], int target) {
		//here we can not return -1, because -1 can be searched value 
		//so here we can use Integer.MIN_VALUE or Integer.MAX_VALUE 
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		for(int element : arr) {
			if(element == target) {
				return element;
			}
		}
		
		return Integer.MAX_VALUE;
	}
	
	//If element is present it will return index of element else it will return -1.
	static int linearSearch(int arr[], int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] == target) {
				return index;
			}
		}
		
		return -1;
	}

}
