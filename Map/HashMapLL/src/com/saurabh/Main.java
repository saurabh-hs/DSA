package com.saurabh;

public class Main {

	public static void main(String[] args) {
		HashMapLL<String, String> map = new HashMapLL<>();
		
		map.put("Mango", "King of fruits");
		map.put("Apple", "A sweet red fruit");
		map.put("Banana", "Healthy fruit");
		
		System.out.println(map);
	}

}
