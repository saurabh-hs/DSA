package com.saurabh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.saurabh.PathQuestion.TreeNode;

public class SerializeDeserializeProblem {

	public class TreeNode{
		private int val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}
	
	public List<String> serialize(TreeNode node) {
		List<String> list = new ArrayList<>();
		helper(node, list);
		return list;
	}
	
	void helper(TreeNode node, List<String> list) {
		if(node == null) {
			list.add("null");
			return;
		}
		
		list.add(String.valueOf(node.val));
		
		helper(node.left, list);
		helper(node.right, list);
	}
	
	public TreeNode deserialize(List<String> list) {
		Collections.reverse(list);
		TreeNode node = helper2(list);
		return node;
	}
	
	TreeNode helper2(List<String> list) {
		String val = list.remove(list.size() - 1);
		
		if(val.charAt(0) == 'n') {
			return null;
		}
		
		TreeNode node = new TreeNode(Integer.parseInt(val));
		
		node.left = helper2(list);
		node.right = helper2(list);
		
		return node;
	}

}
