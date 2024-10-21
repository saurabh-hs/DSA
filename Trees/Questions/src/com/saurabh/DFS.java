package com.saurabh;

import java.util.Arrays;
import java.util.Stack;

public class DFS {
	public class TreeNode{
		private int val;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int val) {
			this.val = val;
		}
	}
	
	//DFS using stack iterative approach
	void dfsStack(TreeNode node) {
		if(node == null) {
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(node);
		
		while(!stack.isEmpty()) {
			TreeNode removed = stack.pop();
			System.out.print(removed.val + " ");
			if(removed.right != null) {
				stack.push(removed.right);
			}
			
			if(removed.left != null) {
				stack.push(removed.left);
			}
		}
	}
	
	int diameter = 0;
	
	public int diameterOfBinaryTree(TreeNode root) {
		height(root);
		return diameter - 1;
	}
	
	int height(TreeNode node) {
		if(node == null) {
			return 0;
		}
		
		int leftHeight = height(node.left);
		int rightHeight = height(node.right);
		
		int dia = leftHeight + rightHeight + 1;
		diameter = Math.max(dia, diameter);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
	
	public void flatten(TreeNode root) {
		TreeNode current = root;
		while(current != null) {
			if(current.left != null) {
				TreeNode temp = current.left;
				while(temp.right != null) {
					temp = temp.right;
				}
				
				temp.right = current.right;
				current.right = current.left;
				current.left = null;
			}
			
			current = current.right;
		}
	}
	
	public boolean isValidBST(TreeNode root) {
		return helper(root, null, null);
	}
	
	public boolean helper(TreeNode node, Integer low, Integer high) {
		if(node == null) {
			return true;
		}
		
		if(low != null && node.val <= low) {
			return false;
		}
		
		if(high != null && node.val >= high) {
			return false;
		}
		
		boolean leftTree = helper(node.left, low, node.val);
		boolean rightTree = helper(node.right, node.val, high);
		
		return leftTree && rightTree;
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null) {
			return null;
		}
		
		if(root == p || root == q) {
			return root;
		}
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(left != null && right != null) {
			return root;
		}
		
		return left == null ? right : left;
	}
	
	int count = 0;
	public int kthSmallest(TreeNode root, int k) {
		return helper(root, k).val;
	}
	
	public TreeNode helper(TreeNode root, int k) {
		if(root == null) {
			return null;
		}
		
		TreeNode left = helper(root.left, k);
		
		if(left != null) {
			return left;
		}
		
		count++;
		
		if(count == k) {
			return root;
		}
		
		return helper(root.right, k);
	}
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if(preorder.length == 0) {
			return null;
		}
		
		int r = preorder[0];
		int index = 0;
		
		for(int i = 0; i < inorder.length; i++) {
			if(inorder[i] == r) {
				index = i;
			}
		}
		
		TreeNode node = new TreeNode(r);
		
		node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
		node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
		
		return node;
	}

}
