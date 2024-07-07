package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CustomArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Primitive data types
//		int[] arr;	
//		arr = new int[5];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		
//		System.out.println(arr[2]);
//		System.out.println(arr[4]);
		
//		int[] arr = new int[5];
//		
//		System.out.println("Please enter array elements: ");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
//		for(int i = 0; i < arr.length; i++) 
//			System.out.println(arr[i]);
		
//		for(int element : arr) {
//			System.out.println(element);
//		}
		
		//Non primitive data types
		String[] names = new String[4];
		
//		for(int i=0; i < names.length; i++) {
//			System.out.println(names[i]);  //it will print null 
//		}
		
		System.out.println("Please enter names: ");
		for(int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i]);
//		}
		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		System.out.println(Arrays.toString(names));

	}

}
