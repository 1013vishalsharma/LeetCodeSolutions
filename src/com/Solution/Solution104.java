package com.Solution;

public class Solution104 {
	
	public int maxDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        else {
        	int i = Math.max(maxDepth(root.left), maxDepth(root.right)) +1;
        	System.out.println(i);
        	return i;
        }        
    }
	
	public int maxDepth(TreeNode root, int depth) {
		if(root != null)
			return Math.max(maxDepth(root.left, 0), maxDepth(root.right, 0)) +1;
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(3);
		tn.left = new TreeNode(9);
		tn.right = new TreeNode(20);
		tn.right.left = new TreeNode(15);
		tn.right.right = new TreeNode(7);
		//tn.right.right.right = new TreeNode(10);
		Solution104 sol = new Solution104();
		sol.maxDepth(tn);
	}

}
