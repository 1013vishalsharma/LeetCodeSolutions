package com.Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

class TreeNode {
	 int val;
	 TreeNode left;
	 TreeNode right;
	 TreeNode(int x) { val = x; }
}

public class Solution94 {
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = inorderTraversal(root, new ArrayList<Integer>());
        for (Iterator iterator = li.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer);
		}
        return li;
    }
	
	public List<Integer> inorderTraversal(TreeNode root, List<Integer> li){
		Stack<TreeNode> stack = new Stack<>();
		while(root != null){
			if(root.left != null){
				stack.add(root);
				root = root.left;
			}
			else{
				li.add(root.val);
				if(root.right != null){
					stack.add(root.right);
					
				}
				
			}
		}
	}

	public static void main(String[] args) {
		TreeNode tn = new TreeNode(1);
		tn.left = null;
		tn.right = new TreeNode(2);
		tn.right.left = new TreeNode(3);
		Solution94 sol = new Solution94();
		sol.inorderTraversal(tn);
	}

}
