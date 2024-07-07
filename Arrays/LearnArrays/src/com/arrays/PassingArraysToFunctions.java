package com.arrays;

import java.util.Arrays;

public class PassingArraysToFunctions {

	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		System.out.println(Arrays.toString(arr));
//		change(arr);
//		System.out.println(Arrays.toString(arr));
		
		String[] names = {"Ram","Shyam","Saurabh"};
		System.out.println(Arrays.toString(names));
		changeName(names, 2);
		System.out.println(Arrays.toString(names));
	}
	
	static void change(int[] arr) {
		arr[0] = 19;
	}
	
	static void changeName(String[] names, int index) {
		for(int i = 0; i < names.length; i++) {
			if(i == index) {
				names[i] = "Bhim";
			}
		}
	}

}
