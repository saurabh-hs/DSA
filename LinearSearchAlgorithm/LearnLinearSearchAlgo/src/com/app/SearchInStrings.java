package com.app;

public class SearchInStrings {

	public static void main(String[] args) {
		String name = "saurabh";
		char target = 'r';
		
		System.out.println(search2(name,target));
	}
	
	//If target found it will return true else will return false
	static boolean search(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(target == str.charAt(i)) {
				return true;
			}
		}
		
		return false;
	}
	
	//if element found it will return char
	//else it will return '('
	static char search1(String str, char target) {
		if(str.length() == 0) {
			return '(';
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(target == str.charAt(i)) {
				return str.charAt(i);
			}
		}
		
		return '(';
	}
	
	static boolean search2(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		
		for(char ch : str.toCharArray()) {
			if(ch == target) {
				return true;
			}
		}
		
		return false;
	}

}
