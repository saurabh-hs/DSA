package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LearnArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add(12);
//		list.add(32);
//		list.add(33);
//		list.add(56);
//		
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list.contains(32));
//		
//		list.set(1, 45);
//		System.out.println(list);
//		
//		list.remove(1);
//		System.out.println(list);
		
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" "); //pass index here, list[index] syntax will be invalid
		}
		
		sc.close();

	}

}
