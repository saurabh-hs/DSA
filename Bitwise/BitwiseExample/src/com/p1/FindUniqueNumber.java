package com.p1;

public class FindUniqueNumber {

	public static void main(String[] args) {
		int[] arr = {2, 3, 3, 4, 2, 6, 4};
		System.out.println(findUnique(arr));
	}
	
	static int findUnique(int[] arr) {
		int unique = 0;
		
		for(int n : arr) {
			unique ^= n;
		}
		
		return unique;
	}

}
