package com.Solution;

public class Solution112 {
	
	public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum, 0, false);
    }
	
	public boolean hasPathSum(TreeNode root, int sum, int total, Boolean found){
		if(root != null && !found){
			total = total + root.val;
			found = hasPathSum(root.left, sum, total, found);
			if(root.left == null && root.right == null){
				if(total == sum){
					found = true;
				}
			}
			found = hasPathSum(root.right, sum, total, found);
		}
		return found;
	}

	public static void main(String[] args) {
		Solution112 sol = new Solution112();
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(4);
		tn.right = new TreeNode(8);
		tn.left.left = new TreeNode(11);
		tn.right.left = new TreeNode(13);
		tn.right.right = new TreeNode(4);
		tn.left.left.left = new TreeNode(7);
		tn.left.left.right = new TreeNode(2);
		tn.right.right.right = new TreeNode(1);
		System.out.println(sol.hasPathSum(tn, 22));
	}

}
