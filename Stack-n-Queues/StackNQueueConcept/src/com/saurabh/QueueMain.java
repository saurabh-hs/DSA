package com.saurabh;

public class QueueMain {

	public static void main(String[] args) throws Exception {
		DynamicQueue queue = new DynamicQueue(5);
		
		queue.insert(4);
		queue.insert(23);
		queue.insert(8);
		queue.insert(34);
		queue.insert(36);
		
		queue.display();
		System.out.println(queue.remove());
		queue.insert(133);
		queue.insert(23);
		queue.display();
		
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		
//		queue.display();
//		queue.insert(133);
	}

}
