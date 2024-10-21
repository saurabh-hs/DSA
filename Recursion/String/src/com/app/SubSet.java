package com.app;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subSetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }

	}
	
	static List<List<Integer>> subSet(int[] arr) {
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		
		for(int num: arr) {
			int n = outer.size();
			for(int i = 0; i < n; i++) {
				List<Integer> innerList = new ArrayList<>(outer.get(i));
				innerList.add(num);
				outer.add(innerList);
			}
		}
		
		return outer;
	}
	
	static List<List<Integer>> subSetDuplicate(int[] arr) {
		List<List<Integer>> outerList = new ArrayList<>();
		outerList.add(new ArrayList<>());
		int start = 0;
		int end = 0;
		
		for(int i = 0; i < arr.length; i++) {
			start = 0;
			 // if current and previous element is same, s = e + 1
			if(i > 0 && arr[i] == arr[i - 1]) {
				start = end + 1;
			}
			
			end = outerList.size() - 1;
			int n = outerList.size();
			for(int j = start; j < n; j++) {
				List<Integer> inner = new ArrayList<>(outerList.get(j));
				inner.add(arr[i]);
				outerList.add(inner);
			}
		}
		
		return outerList;
	}

}
