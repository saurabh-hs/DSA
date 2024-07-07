package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[][] arr; //declaration
//		arr = new int[3][]; //initialization
		
		/*
		 	{1, 2, 3}
		 	{4, 5, 6}
		 	{7, 8, 9}
		 */
		
//		int[][] arr = {
//				{1, 2, 3},
//				{4, 5},
//				{7, 8, 9, 10}
//		};
//		
//		for(int row = 0; row < arr.length; row++) {
//			//for each col in every row
//			for(int col = 0; col < arr[row].length; col++) {
//				System.out.print(arr[row][col]+" ");
//			}
//			System.out.println();
//		}
		
		int[][] arr = new int[3][3];
		
		System.out.println("Please enter value: ");
		for(int row = 0; row < arr.length; row++) {
			//for each col in every row
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		
//		for(int row = 0; row < arr.length; row++) {
//			for(int col = 0; col < arr[row].length; col++) {
//				System.out.print(arr[row][col]+" ");
//			}
//			System.out.println();
//		}
		
//		for(int[] a : arr) {
//			for(int element : a) {
//				System.out.print(element+" ");
//			}
//			System.out.println();
//		}
		
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}

	}

}