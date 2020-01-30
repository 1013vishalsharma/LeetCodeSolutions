package com.Solution;

public class Solution111 {
	
	public int minDepth(TreeNode root) {
        if(root != null) {
        	int min = preOrder(root, 0, Integer.MAX_VALUE);
        	System.out.println(min);
        	return min;
        }
        else {
        	return 0;
        }
    }
	
	public int preOrder(TreeNode root, int depth, int minDepth) {
		if(root != null) {
			if(root.left == null && root.right == null) {
				if(depth < minDepth) {
					minDepth = depth;
				}
			}
		minDepth = preOrder(root.left, depth+1, minDepth);
		minDepth = preOrder(root.right, depth+1, minDepth);
		}
		return minDepth;
	}

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(3);
		tn.left = new TreeNode(9);
		tn.right = new TreeNode(20);
		tn.right.left = new TreeNode(15);
		tn.right.right = new TreeNode(7);
		tn.left.left = new TreeNode(201);
		Solution111 sol = new Solution111();
		sol.minDepth(tn);
	}

}
