package com.saurabh;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InBuiltExamples {

	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<>();
//		stack.push(34);
//		stack.push(45);
//		stack.push(2);
//		stack.push(9);
//        stack.push(18);
//        
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        //System.out.println(stack.pop());
        
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(23);
//        queue.add(43);
//        queue.add(8);
//        queue.add(45);
//        queue.add(89);
//        
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        System.out.println(deque.removeLast());
	}

}
