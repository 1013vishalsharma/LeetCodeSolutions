package com.Solution;

import java.util.ArrayList;
import java.util.List;

public class solution98 {

	public boolean isValidBST(TreeNode root) {
        List<Integer> li = inOrder(root, new ArrayList<>());
        for (int i = 1; i < li.size(); i++) {
			if(li.get(i) <= li.get(i-1))
				return false;
		}
        return true;
    }
	
	public List<Integer> inOrder(TreeNode root, ArrayList<Integer> li){
		if(root != null){
			inOrder(root.left, li);
			li.add(root.val);
			inOrder(root.right, li);
		}
		return li;
	}
	
	public static void main(String[] args) {

		solution98 sol = new solution98();
		TreeNode tn = new TreeNode(5);
		tn.left = new TreeNode(1);
		tn.right = new TreeNode(4);
		tn.right.left = new TreeNode(3);
		tn.right.right = new TreeNode(6);
		System.out.println(sol.isValidBST(tn));
	}

}
